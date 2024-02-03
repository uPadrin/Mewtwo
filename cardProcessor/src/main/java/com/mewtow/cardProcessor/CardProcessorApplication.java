package com.mewtow.cardProcessor;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CardProcessorApplication {

	public static void main(String[] args) {/* {
		SpringApplication.run(CardProcessorApplication.class, args);
	} */
			try (CSVReader reader = new CSVReader(new FileReader("input-data.csv"))) {
				List<String[]> r = reader.readAll();
				r.forEach(x -> System.out.println(Arrays.toString(x)));
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			} catch (IOException | CsvException e) {
				throw new RuntimeException(e);
			}
		}
	}

