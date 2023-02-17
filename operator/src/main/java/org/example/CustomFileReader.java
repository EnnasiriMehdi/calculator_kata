package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface CustomFileReader {
    public List<String> read(String path) throws IOException;
}
