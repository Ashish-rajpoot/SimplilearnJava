package LearnRegex;

import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class ex1 {
    public static void main(String[] args) {
        String str = "hello1235";

        System.out.println(Pattern.compile("[^(a-zA-Z0-9)]").matcher(str).find());
    }
}
