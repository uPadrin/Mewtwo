package com.mewtow.cardProcessor;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Util {

    public void ler()

    {
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
