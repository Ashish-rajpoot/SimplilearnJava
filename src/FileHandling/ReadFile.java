package FileHandling;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadFile {

    private List<String> readFile(String fileName) {
        List<String> str = Collections.emptyList();
        try {
            str = Files.readAllLines(Paths.get("C:\\Users\\ashis\\OneDrive\\Desktop\\" + fileName), StandardCharsets.UTF_8);
//            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }


    // Read Files
    public static void readFiles() {

        File file = new File("C:\\Users\\ashis\\OneDrive\\Desktop");
        File[] files = file.listFiles();
        for (File file1 : files){
            if(file1.isDirectory()){
                File[] folderFiles = file1.listFiles();
                    for(File ff : folderFiles){
                        System.out.println(" folder Files "+ff.getName());
                    }
            }
            System.out.println("Files " +file1.getName());
        }
    }

    public static void main(String[] args) {
//        int i = 1;
//        ReadFile readFile = new ReadFile();
//        List<String> lines = readFile.readFile("hello1.txt");
//        for (String line : lines) {
//            System.out.println(i + " " + line);
//            i++;
//        }

        readFiles();
    }
}
