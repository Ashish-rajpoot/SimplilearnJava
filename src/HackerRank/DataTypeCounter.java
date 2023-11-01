package HackerRank;

import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;

public class DataTypeCounter {

    public static void typeCounter(String sentence) {

        int stringCount = 0;
        int integerCount = 0;
        int doubleCount = 0;

        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            if (word.matches("[a-z]+")) {
                stringCount++;
            } else if (word.matches("\\b\\d+\\b")) {
                integerCount++;
            } else if (word.matches("\\b\\d+\\.\\d+\\b")) {
                doubleCount++;
            }
        }


        // Print the counts in the specified format
        System.out.println("string " + stringCount);
        System.out.println("integer " + integerCount);
        System.out.println("double " + doubleCount);
    }


    public static void main(String[] args) {
        String sentence = "1 2 2 2 2.2 2.2f adsfa asdfd    asdfffdsf ds                       zsdffdsfds";
    typeCounter(sentence);
    }


}
