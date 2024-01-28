package FileOperation.FileClass;

import java.io.*;

/**
 * BufferReader
 * This class is used for reading data line by line
 * This class constructor accept FileReader class object so create a object by passing file path or File object
 * methods:
 * readLine(): Reads a line of text
 */

public class BufferReaderClass4 {

    public void readLineByLine() throws IOException {
        File file = new File("src\\FileOperation.FilesToRead\\ReadFile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line=bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferReaderClass4 bufferReaderClass4 = new BufferReaderClass4();
        bufferReaderClass4.readLineByLine();
    }
}
