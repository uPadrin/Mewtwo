package br.com.Mewtwo.sendMessage.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import org.rabbitmq.dtos.TransactionDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.rabbitmq.constants.RabbitMQConstants.*;

@RequiredArgsConstructor
@Log4j2
@Service
public class TransactionService {

    private final RabbitTemplate rabbitTemplate;

    public void createTransaction(TransactionDTO dto) {
        log.info("Sending a message to exchange " + dto.toString());
        rabbitTemplate.convertAndSend(EXG_NAME_AMQ, RK_TRANSACTION, dto);
    }

    public void leitor() {
        String csvFile = "input-data.csv";
        String line;
        String cvsSplitBy = ";";

        String jsonFile;
        try (
                BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] data = line.split(cvsSplitBy);

                JSONObject json = new JSONObject();
                json.put("ID da Transacao", data[0]);
                json.put("Data da Transacao", data[1]);
                json.put("Documento", data[2]);
                json.put("Nome", data[3]);
                json.put("Idade", data[4]);
                json.put("Valor", data[5]);
                json.put("Num. de Parcelas", data[6]);

                jsonFile = (json.toString());
                System.out.println(jsonFile);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
