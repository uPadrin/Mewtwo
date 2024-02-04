package br.com.Mewtwo.sendMessage.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.rabbitmq.dtos.TransactionDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.rabbitmq.constants.RabbitMQConstants.*;

@RequiredArgsConstructor
@Log4j2
@Service
public class TransactionService {

    @Autowired
    private final RabbitTemplate rabbitTemplate;

    public void createTransaction(String message) {
        log.info("Sending a message to exchange " + message);
        rabbitTemplate.convertAndSend(EXG_NAME_AMQ, RK_TRANSACTION, message);
    }

    public void leitor() {
        String csvFile = "input-data.csv";
        String line;
        String cvsSplitBy = ";";

        JSONArray jsonArray = new JSONArray(); // Cria um array JSON vazio

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);

                JSONObject json = new JSONObject();
                json.put("transactionId", data[0]);
                json.put("transactionDate", data[1]);
                json.put("id", data[2]);
                json.put("name", data[3]);
                json.put("age", data[4]);
                json.put("amount", data[5]);
                json.put("installmentNumber", data[6]);

                jsonArray.put(json); // Adiciona o objeto JSON ao array JSON
            }

            // Agora que o loop terminou, o array JSON está completo
            String jsonFile = jsonArray.toString();


            // Escrever a string JSON em um arquivo
            try (FileWriter file = new FileWriter("output.json")) {
                file.write(jsonFile);
                System.out.println("Arquivo JSON criado com sucesso.");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
