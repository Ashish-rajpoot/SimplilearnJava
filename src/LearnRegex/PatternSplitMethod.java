package LearnRegex;

import java.util.regex.Pattern;

public class PatternSplitMethod {
    public static void main(String[] args) {
//        String s = "I have an Apple";

//        Pattern p  = Pattern.compile("\\s");
        String  s = "www.google.com";
//        Pattern p  = Pattern.compile("\\.");
        Pattern p  = Pattern.compile("[.]");
        String[] s1 = p.split(s);
        for (String string : s1){
            System.out.println(string);
        }
    }
}
