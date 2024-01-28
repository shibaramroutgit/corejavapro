package FileOperation.FileClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter
 * This class is used for writing data characters by characters.
 * Methods:
 * write(): write a characters.
 *
 */

public class FileWriterClass3 {

    public void writeChar() throws IOException {
        File file = new File("src\\FileOperation.FilesToRead\\WriteFile.txt");
        FileWriter fileWriter = new FileWriter(file);
        char data = 'c';
        fileWriter.write(data);
        fileWriter.close();

    }

    public void writeMultipleChar() throws IOException {
        File file = new File("src\\FileOperation.FilesToRead\\WriteFile.txt");
        FileWriter fileWriter = new FileWriter(file);
        String data = "Dasarathi Rout";
        char[] cData = data.toCharArray();
        fileWriter.write(cData);
        fileWriter.close();

    }



    public static void main(String[] args) throws IOException {
        FileWriterClass3 fileWriterClass3 = new FileWriterClass3();
        fileWriterClass3.writeChar();
        fileWriterClass3.writeMultipleChar();
    }
}
