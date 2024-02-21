package Digitalocean;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckVowel {
    public static void main(String[] args) {
        String str = "sldkfjsldfjksldkfjjsdldkfkj";

       boolean is = IntStream.range(0,str.length()).anyMatch(i->Pattern.compile("[aeiou]").matcher(String.valueOf(str.charAt(i))).find());
        System.out.println(is);
    }
}
