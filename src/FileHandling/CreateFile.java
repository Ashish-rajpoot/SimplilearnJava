package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CreateFile {

    static void createFileUseingFile() throws IOException {
        String regx = ".*\\..*";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Provide the File Name");
        while (true) {
            String fileName = scanner.next();
//            String path = "C:\\Users\\ashis\\OneDrive\\Desktop\\" + fileName;
            String path = "C:\\Users\\ashis\\OneDrive\\Desktop\\";
            File file = new File(path,"newFile.txt");
//            if (Pattern.matches(regx, fileName)) {
//                if (file.createNewFile()) {
//                    System.out.println("file Created " + fileName);
//                }
//            } else {
//                System.out.println("Please Enter the file Name Followed By the file Extension");
//            }

                    System.out.println("file Created ");

        }
    }


    static void addData(){
        String fileName = "hello.txt";
        String path = "C:\\Users\\ashis\\OneDrive\\Desktop\\" + fileName;
        FileOutputStream out = null;
        String data = "Edit some random text";
        try{
            out = new FileOutputStream(path);
            out.write(data.getBytes());
            System.out.println("Text is Added to File" );
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    // Add file and add text
    public static void addFileAndData()  {
        String fileName = "hello1.txt";
        String url = "C:\\Users\\ashis\\OneDrive\\Desktop\\" + fileName;
//        String data = "Random Data to enter next data";
        List<String > strings =  Arrays.asList("Line First","line Second");
        Path path = Paths.get(url);
        try {
            Files.write(path,strings,StandardOpenOption.APPEND);
            System.out.println("File updated");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws IOException {
        createFileUseingFile();
//        addData();
//            addFileAndData();
    }
}
