package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConverToArray {

    public static void main(String[] args) throws IOException {

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        List<Integer> convertedToAray = new ArrayList<>();
        int temp = 0;
        //            while (!bufferedReader.readLine().isEmpty()){
        while (scanner.hasNextInt()){
        convertedToAray.add(temp,(scanner.nextInt()));

        temp++;
        }
        System.out.println("convertedArray"+convertedToAray);
        scanner.close();

    }


}
