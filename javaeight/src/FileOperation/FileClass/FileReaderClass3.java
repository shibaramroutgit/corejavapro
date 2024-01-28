package FileOperation.FileClass;

import java.io.*;

/**
 * FileReader
 * This class is used for reading data characters by characters.
 * Methods:
 * read(): Reads a characters.
 *
 */

public class FileReaderClass3 {

    public void readCharByChar() throws IOException {
        File file = new File("src\\FileOperation.FilesToRead\\ReadFile.txt");
        FileReader fileReader = new FileReader(file);
        int data;
        while ((data=fileReader.read())!=-1)
        {
            System.out.println((char) data);
        }
        fileReader.close();

    }


    public static void main(String[] args) throws IOException {
        FileReaderClass3 fileReaderClass3 = new FileReaderClass3();
        fileReaderClass3.readCharByChar();
    }
}
