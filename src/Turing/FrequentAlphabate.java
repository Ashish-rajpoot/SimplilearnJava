package Turing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequentAlphabate {
    public static void main(String[] args) {
        String str = "abcdddeffd121111233333333aaaAAAAAAAA";
        char[] chars = str.toCharArray();
        char result = str.charAt(0);
        int count = 0;
        int temp = 0;
        for (char c1 : chars) {
            if (Character.isAlphabetic(c1)) {
                Pattern p = Pattern.compile(Character.toString(c1));
                Matcher m = p.matcher(str);
                while (m.find() && m.group().equals(Character.toString(c1))) {
                    temp++;
                }
                if (count < temp) {
                    result = c1;
                }
                temp = 0;
            }
        }
            System.out.println(result);
    }
}
