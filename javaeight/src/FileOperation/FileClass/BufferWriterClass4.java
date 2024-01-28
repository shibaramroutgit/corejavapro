package FileOperation.FileClass;

import java.io.*;

/**
 * BufferWriter
 * This class is used for writing data line by line
 * This class constructor accept FileWriter class object so create a object by passing file path or File object
 * methods:
 * write(): write a line of text
 */

public class BufferWriterClass4 {

    public void writeLineByLine() throws IOException {
        File file = new File("src\\FileOperation.FilesToRead\\WriteFile.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line = "Moves are always only diagonal";
        bufferedWriter.write(line);
        bufferedWriter.close();

    }

    public static void main(String[] args) throws IOException {
        BufferWriterClass4 bufferWriterClass4 = new BufferWriterClass4();
        bufferWriterClass4.writeLineByLine();
    }
}
