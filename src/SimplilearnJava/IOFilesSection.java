package SimplilearnJava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class IOFilesSection {

    public static void createFile() {
        FileWriter fileWriter = null;
        String data = "Data is addedd";
        File file = new File("G:\\Intellij\\SimplilearnJava\\src\\SimplilearnJava\\file1.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("New File Created");
                fileWriter = new FileWriter(file);
                fileWriter.write(data);
                fileWriter.close();
            } else {
                System.out.println("File Already Exists");
                fileWriter = new FileWriter(file);
                fileWriter.write(data);
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    Create file by FOS
    public static void byFOS() {

        String data = "Hello how are you?";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("G:\\Intellij\\SimplilearnJava\\src\\SimplilearnJava\\file2.txt");
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //    Create file by NIO
    public static void createByNIO()  {
        Path path = Paths.get("G:\\Intellij\\SimplilearnJava\\src\\SimplilearnJava\\nio.txt");
        try {
           Path file = Files.createFile(path);
           if(file.getFileName()!=null){
               System.out.println("file Created " + file.getFileName());
           }
            int i = 1;
            while (i <= 10) {
                Files.write(path, ("hello new line : " + i + "\n").getBytes(), StandardOpenOption.APPEND);
                i++;
            }
            Files.readString(path);
        } catch (FileAlreadyExistsException e) {
            try {
                Files.delete(path);
                System.out.println("File Deleted");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        createFile();
//        byFOS();
        createByNIO();
    }
}
