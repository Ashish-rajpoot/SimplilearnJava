package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToken {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String token =br.readLine().trim();
//        String token = "He is a very very good boy, isn't he?";
//        String token = "           YES      leading spaces        are valid,    problemsetters are         evillllll".trim();
        String token = "                        ";
        String[] splitedArray = token.split("[ ,?!']+");

        if (token.trim().length() == 0) {
            System.out.println(0);
        } else {

            System.out.println(splitedArray.length);
            for (String x : splitedArray) {
                System.out.println(x);
            }
        }
    }
}
