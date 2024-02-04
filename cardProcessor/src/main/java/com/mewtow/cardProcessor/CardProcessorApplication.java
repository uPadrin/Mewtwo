package com.mewtow.cardProcessor;
import com.mewtow.cardProcessor.Service.PersonService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardProcessorApplication {


    public static void main(String[] args) {

        PersonService personService = new PersonService();

        personService.leitor();

    }
}