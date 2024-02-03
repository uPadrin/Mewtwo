package com.mewtow.cardProcessor;
import com.mewtow.cardProcessor.Service.PersonService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

@SpringBootApplication
public class CardProcessorApplication {


    public static void main(String[] args) {/* {
		SpringApplication.run(CardProcessorApplication.class, args);
	} */

        PersonService personService = new PersonService();

        personService.leitor();

    }
}