package LearnRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {
    public static void main(String[] args) {

//        Basic Regex Examples

//        String text = "The quick brown fox jumps over the lazy dog 1 ok john@gmail.com";
//        String pattern = "\\b\\w{2,4}\\b"; // Matches 3-letter words
//        String pattern = "\\b\\w{2,}\\b"; // Matches 3-letter words
//        String pattern = "\\b\\w{2}\\b"; // Matches 3-letter words
//        String pattern = "\\bok\\b"; // Matches 3-letter words
//        String pattern = "\\b\\S\\b"; // Matches 3-letter words
//        String pattern = "\\b\\w+@\\w+\\.\\w+\\b"; // Matches 3-letter words

//        Medium Regex Examples

        String text = "The quick brown fox 2023-23-02";
        String pattern = "\\b\\d{4}-\\d{2}-\\d{2}\\b"; // Matches 3-letter words

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
