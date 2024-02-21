package LearnRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
//        String s = "ab7 #b9";
        String s = "abaabbaaaba";
//        Pattern p = Pattern.compile("a");
//        Pattern p = Pattern.compile("a+");
        Pattern p = Pattern.compile("a*");
//        Pattern p = Pattern.compile("a?");
        Matcher m = p.matcher(s);

        while (m.find()){
            System.out.println(m.start() + "...." + m.group());
        }
    }
}
