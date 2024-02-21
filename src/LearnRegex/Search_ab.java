package LearnRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search_ab {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ababbababbbab");
        int count = 0;
        while (m.find()){
            count++;
            System.out.println(m.start()+"..." + m.end()+ "..." + m.group());
        }
        System.out.println(count);
    }
}
