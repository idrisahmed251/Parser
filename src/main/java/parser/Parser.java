package main.java.parser;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class Parser {
    public static void main(String[] args) throws IOException {
        File file = new File(new File(".").getCanonicalPath()  + "\\src\\main\\java\\parser");
        FileHandler fileHandler = new FileHandler(file);
        //Set<File> files = FileHandler.getFilesFromWorkingDirectory(new File(".").getCanonicalPath()  + "\\src\\main\\java\\parser");
        //FileHandler.printAllFiles(files);
    }
}
