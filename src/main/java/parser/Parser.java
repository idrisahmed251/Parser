package main.java.parser;

import java.io.File;
import java.io.IOException;

public class Parser {
    public static void main(String[] args) throws IOException {
        FileHandler files = new FileHandler(new File(new File(".").getCanonicalPath()  + "\\src\\main\\java\\parser"));
    }
}
