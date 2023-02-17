package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculator {

    private final List<String> lines;
    private final String operator;
    private final Logger logger;

    private final Map<String, String> map = new HashMap<String, String>() {{
        put("+", "addition");
        put("-", "subtraction");
        put("*", "multiplication");
    }};


    public Calculator(List<String> lines, String operator, Logger logger) {
        this.lines = lines;
        this.operator = operator;
        this.logger = logger;
    }

    public int calculate() {
        this.logger.log("applying operation " + this.map.get(this.operator));
        int total = 0;

        if (this.lines.size() == 0) {
            return total;
        }

        for( int i = 0; i < lines.size(); i ++) {
            this.logger.log("parsed value = " + lines.get(i).trim());
            if (this.operator.equals("+")) {
                total = this.sum(total, Integer.parseInt(lines.get(i).trim()));
            } else if (this.operator.equals("-")) {
                total = this.subtract(total, Integer.parseInt(lines.get(i).trim()));
            } else {
                total = this.multiply(total, Integer.parseInt(lines.get(i).trim()));
            }
            this.logger.log("accumulation : " + total +" on line " + (i+1));
        }
        return total;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
