package main.java.parser;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class FileHandler {
    private File rootDirectory;
    private Set<File> filesFromRoot;
    private int numberOfFiles;

    public FileHandler(File rootDirectory) {
        this.rootDirectory = rootDirectory;
        getFilesFromWorkingDirectory();
    }

    public  void getFilesFromWorkingDirectory() {
        Set<File> filesInWorkingDirectory = new HashSet<>();
        for (File file : rootDirectory.listFiles())
            if (file.isFile()) filesInWorkingDirectory.add(file);

        this.filesFromRoot = filesInWorkingDirectory;
        this.numberOfFiles = filesInWorkingDirectory.size();
    }

    public Set<String> getAllFileNames() {
        Set<String> fileNames = new HashSet<>();
        for (File a : filesFromRoot) {
            String result[] = a.getPath().split("\\\\");
            fileNames.add(result[result.length - 1]);
        }
        return fileNames;
    }

    public Set<File> getAllFiles() { return filesFromRoot; }

    public int getNumberOfFiles() { return numberOfFiles; }
}
