package W3Resource_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question1 {

    public static void main(String[] args) {
    String input = "hello cat dog and all the animals of this zoo";

    String regex = "[a-zA-Z0-9]*";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(input);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
