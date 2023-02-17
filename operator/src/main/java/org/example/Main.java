package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        ArgParser argParser = new ArgParser(args);
        ProgramArgs programArgs = argParser.parse();
        Logger logger = new Logger(programArgs.isLogging());
        logger.log("Program started");

        TxtReaderCustom txtReader = new TxtReaderCustom();
        List<String> lines = txtReader.read(programArgs.getFilename());
        Calculator calculator = new Calculator(lines, programArgs.getOperator(), logger);
        System.out.println("total = " + calculator.calculate());
        logger.log("Program ended");
    }
}