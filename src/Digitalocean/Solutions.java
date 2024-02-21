package Digitalocean;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solutions {

    public static void reversString(String str) {
        String[] strings = str.split(" ");
        String strs = IntStream.range(0, strings.length).mapToObj(i -> strings[strings.length - 1 - i]).collect(Collectors.joining(" "));
        System.out.println(strs);
    }

    public static void swapNumber(int a, int b) {
        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("a " + a + "\n" + "b " + b);
    }

    public static void isVowel(String str) {
//        System.out.println(Pattern.compile("[aeiou]").matcher(str).find());
        String vowel = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowel.length(); j++) {
                if (vowel.charAt(j) == str.charAt(i)) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }

    public static void isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static void removeWhiteSpaces(String str) {
        String[] strings = str.split(" ");
        List<String> strings1 = new ArrayList<>();
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(str);
        while (m.find()) {
            strings1.add(m.group());
        }
        String result = strings1.stream().collect(Collectors.joining(" "));
        System.out.println(result);


    }

    public static int fibbo(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibbo(n - 1) + fibbo(n - 2);
    }

    public static int countTheNumberInDigit(int n) {
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        int i = 1;
            int reminder = n / 10;
            System.out.println(reminder);
            numbers.add(n % 10);
            count++;
            i++;
           reminder = countTheNumberInDigit(reminder);
        return count;
    }


    public static void main(String[] args) {
//        reversString("How Are Your doing?");
//        swapNumber(1, 2);
//        isVowel("sdfkljsdfljdsa");
//        isPalindrome("adaada");
//        removeWhiteSpaces("  abc  def\t");
//        System.out.println( fibbo(9));
        System.out.println(countTheNumberInDigit(1234));
    }

}
