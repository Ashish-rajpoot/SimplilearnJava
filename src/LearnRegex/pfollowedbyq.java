package LearnRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pfollowedbyq {

    public static boolean tests() {
        String str = "pqawaqjalsfa1aqaqp";
        Pattern p = Pattern.compile("pq*");
        Matcher m = p.matcher(str);
        List<String> strings = new ArrayList<>();
        System.out.println(m.find());
        while (m.find()) {
            strings.add(m.group());
//            System.out.println(m.group() + "---------" + m.start() + "---------" + m.end());
        }

        strings.stream().forEach(System.out::println);
        System.out.println(strings.size());
        return true;
    }

    public static boolean isValidMail(String str) {
        Pattern p = Pattern.compile("^[\\w\\._]+@[a-zA-Z\\d\\._]+\\.[\\w]{2,}$");
//        Pattern p = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
//        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]([.][a-zA-Z0-9]+)+");
        Matcher m = p.matcher(str);
        if (m.find() && m.group().equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        System.out.println(tests("pq"));
        String mail = "kumar_alex.234@gmail.com";
        System.out.println(isValidMail(mail));
    }
}
