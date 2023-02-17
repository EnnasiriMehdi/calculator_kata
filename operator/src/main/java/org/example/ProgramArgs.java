package org.example;

public class ProgramArgs {

    private String operator;
    private String filename;
    private boolean logging;

    public void setLogging(boolean logging) {
        this.logging = logging;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getOperator() {
        return operator;
    }

    public String getFilename() {
        return filename;
    }

    public boolean isLogging() {
        return logging;
    }
}
