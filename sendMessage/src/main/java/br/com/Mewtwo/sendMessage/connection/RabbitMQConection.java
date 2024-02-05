package br.com.Mewtwo.sendMessage.connection;

import br.com.Mewtwo.sendMessage.service.TransactionService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.rabbitmq.dtos.TransactionDTO;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.rabbitmq.constants.RabbitMQConstants.EXG_NAME_AMQ;
import static org.rabbitmq.constants.RabbitMQConstants.QUEUE_NAME_TRANSACTION;

@Component
public class RabbitMQConection {

    private final AmqpAdmin amqpAdmin;
    private final ObjectMapper objectMapper;
    private final TransactionService transactionService;

    @Autowired
    public RabbitMQConection(AmqpAdmin amqpAdmin, ObjectMapper objectMapper, TransactionService transactionService) {
        this.amqpAdmin = amqpAdmin;
        this.objectMapper = objectMapper;
        this.transactionService = transactionService;
    }

    @PostConstruct
    public void inicializar() {

        Queue filaJson = fila(QUEUE_NAME_TRANSACTION);
        DirectExchange troca = trocaDireta();
        Binding ligacaoJson = relacionamento(filaJson, troca);

        amqpAdmin.declareExchange(troca);
        amqpAdmin.declareQueue(filaJson);
        amqpAdmin.declareBinding(ligacaoJson);
        transactionService.leitor();

        enviarObjetosParaFila();

    }

    public void enviarObjetosParaFila() {
        try {
            List<TransactionDTO> jsonDtoList = readJsonFromFile("output.json");
            System.out.println("Enviando objetos Json para a fila");
            for (TransactionDTO dto : jsonDtoList) {
                // Converter JsonDto para JSON e enviar para a fila
                String jsonStr = objectMapper.writeValueAsString(dto);
                transactionService.createTransaction(jsonStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Queue fila(String nomeFila) {
        return new Queue(nomeFila, false, false, false);
    }

    private DirectExchange trocaDireta() {
        return new DirectExchange(EXG_NAME_AMQ);
    }

    private Binding relacionamento(Queue fila, DirectExchange troca) {
        return new Binding(fila.getName(), Binding.DestinationType.QUEUE, troca.getName(), fila.getName(), null);
    }

    private List<TransactionDTO> readJsonFromFile(String filePath) throws IOException {
        return objectMapper.readValue(new File(filePath), new TypeReference<List<TransactionDTO>>() {});
    }
}
