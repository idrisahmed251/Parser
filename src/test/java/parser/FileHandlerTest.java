package test.java.parser;

import main.java.parser.FileHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FileHandlerTest {
    @Test
    public void printAllFiles() throws Exception {
        TemporaryFolder tempFolder = new TemporaryFolder();
        tempFolder.create(); tempFolder.newFile("fileOne"); tempFolder.newFile("fileTwo");
        FileHandler fileHandler = new FileHandler(tempFolder.getRoot());

        fileHandler.getFilesFromWorkingDirectory();
        Set<String> fileNames = fileHandler.getAllFileNames();

        assertThat(fileHandler.getNumberOfFiles(), equalTo(2));
        assertThat(fileNames, contains("fileOne", "fileTwo"));
    }
}