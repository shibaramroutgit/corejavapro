package FileOperation.FileClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutPutStream
 * This classes is used for writing to files in a byte-wise manner.
 * Methods:
 * write() : write data byte by byte.
 *
 */

public class FileOutPutStreamClass2 {


    public void writeByte() throws IOException {
        File file = new File("src\\FileOperation.FilesToRead\\WriteFile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(65);
        fileOutputStream.close();
    }

    public void writeMultipleBytes() throws IOException {
        File file = new File("src\\FileOperation.FilesToRead\\WriteFile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String name = "DasarathiRout";
        byte[] bData = name.getBytes();
        fileOutputStream.write(bData);
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        FileOutPutStreamClass2 fileOutPutStreamClassEx1 = new FileOutPutStreamClass2();
        fileOutPutStreamClassEx1.writeByte();
        fileOutPutStreamClassEx1.writeMultipleBytes();
    }
}
