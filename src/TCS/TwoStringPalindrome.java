package TCS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoStringPalindrome {

    public static List<String> subString(String x) {
        if (x.isEmpty()) {
            List<String> result = new ArrayList<>();

        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= x.length(); i++) {
            for (int j = i + 1; j <= x.length(); j++) {
                result.add(x.substring(i, j));
            }

        }
        return result;
    }


    public static String isPalindrom(String x) {
        if (x.length() < 6 || x.length() % 2 == 1) {
            return null;
        }
        for (int i = 0; i < x.length() / 2; i++) {
            if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
                return null;
            }
        }
        return x;
    }

    public static void subString(String x, String y) {
        List<String> dadX = subString(x);
        List<String> momY = subString(y);
        for (int i = 0; i < dadX.size(); i++) {
            for (int j = 0; j < momY.size(); j++) {
                String parent = dadX.get(i).concat(momY.get(j));
                String result = isPalindrom(parent);
                if (result != null) {
                    System.out.printf("Congrate's You got your baby name :) %s", result);
                    return;
                }
            }
        }
                System.out.printf("Sorry no match found for your baby :(");

    }

    public static void main(String[] args) {
//        subString("geeks");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide father name");
        String dadX = scanner.next();
        System.out.println("Provide Mother name");
        String momY = scanner.next();
        scanner.close();
        subString(dadX, momY);
//        subString("xzyawl","yaway");
//        System.out.println( isPalindrom("iraari"));
    }
}
//ariairam