package main.java.parser;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Parser {
    private final static String here = "\\\\src\\\\main\\\\java\\\\parser";

    public static void main(String[] args) throws IOException {
        Set<File> files = new HashSet<>(new FileHandler(new File(new File(".").getCanonicalPath()+here)).getAllFiles());
    }
}
