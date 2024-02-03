package com.mewtow.cardProcessor.Service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class PersonService {
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
