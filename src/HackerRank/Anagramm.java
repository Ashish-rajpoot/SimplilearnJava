package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Anagramm {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        String value1 = sc.next();
//        String value2 = sc.next();
        String value1 = "anagramm";
        String value2 = "marganaa";


        // String[] string = value.split(" ");
        char[] charArray1 = value1.toUpperCase().toCharArray();
        char[] charArray2 = value2.toUpperCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println(charArray1);
        System.out.println(charArray2);

        String result = "";
        if(value1.length()!=value2.length()){
            result="Not Anagrams";
        }else {
            for (int i = 0; i < charArray1.length; i++) {
                if (Character.compare(charArray1[i],charArray2[i])==0) {
                    result = "Anagrams";
                } else {
                    result = "Not Anagrams";
                    break;
                }
            }
        }
        System.out.println(result);
    }
}