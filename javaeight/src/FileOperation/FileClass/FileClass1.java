package FileOperation.FileClass;

import java.io.File;

/**
 * File Class
 * The File class represents a file or directory path
 * Methods:
 * exists(): Checks if the file or directory exists.
 * isFile(): Checks if it is a file.
 * isDirectory(): Checks if it is a directory.
 * createNewFile(): Creates a new empty file.
 * mkdir(): Creates a new directory.
 * getAbsolutePath() : To get the absolute path of file or directory
 * canRead() : To verify is it in allow to read data
 * canWrite() : To verify is it allows to write into file
 */
public class FileClass1 {
    public static void main(String[] args) {

        File file = new File("src\\FileOperation.FilesToRead\\ReadFile.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

    }
}
