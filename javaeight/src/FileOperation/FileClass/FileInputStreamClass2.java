package FileOperation.FileClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream
 * This class is used for reading from  files in a byte-wise manner
 * Methods:
 * read() : Read data byte by byte. It returns int val.
 * if it is positive then file has data and if it is negative file has non data
 */


public class FileInputStreamClass2 {

    public static void main(String[] args) throws IOException {
        File file = new File("src\\FileOperation.FilesToRead\\ReadFile.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data;
        while ((data=fileInputStream.read())!=-1)
        {
            System.out.print((char)data);
        }
        fileInputStream.close();

    }
}
