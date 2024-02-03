package com.mewtow.cardProcessor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CardProcessorApplication {

	public static void main(String[] args) {/* {
		SpringApplication.run(CardProcessorApplication.class, args);
	} */

        String csvFile = "C:\\Users\\bryan\\OneDrive\\Documentos\\Mewtwo\\cardProcessor\\input-data.csv";
        String jsonFile = "DONE.json";

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line;
            JSONArray jsonArray = new JSONArray();

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                JSONObject jsonObject = new JSONObject();
                for (int i = 0; i < fields.length; i++) {
                    jsonObject.put("field" + i, fields[i]);
                }
                jsonArray.add(jsonObject);
            }

            FileWriter fileWriter = new FileWriter(jsonFile);
            fileWriter.write(jsonArray.toJSONString());
            fileWriter.flush();
            fileWriter.close();

            br.close();
            System.out.println("Conversion completed: CSV to JSON");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}