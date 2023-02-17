package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private final boolean active;

    public Logger(boolean active) {
        this.active = active;
    }

    public void log(String message) {
        if (this.active) {
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
            System.out.println("[" + dateFormat.format(date) + "][log]" + message);
        }
    }
}
