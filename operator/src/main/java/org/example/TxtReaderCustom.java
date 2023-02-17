package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtReaderCustom implements CustomFileReader {


    @Override
    public List<String> read(String path) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader(path));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        while (line != null) {
            listOfLines.add(line); line = bufReader.readLine();
        }
        bufReader.close();


        return listOfLines;
    }
}
