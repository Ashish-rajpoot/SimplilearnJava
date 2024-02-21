package LearnRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumbers {
    public static void main(String[] args) {
        // 10 digit mobile numbers
        Pattern p = Pattern.compile("[7-9][0-9]{9}");
        // 11 digit mobile numbers
        Pattern p11 = Pattern.compile("(0)?[7-9][0-9]{9}");
        // 12 digit mobile numbers
        Pattern p12 = Pattern.compile("(0|91)?[7-9][0-9]{9}");

        String  input = "82312312322423424432";

        Matcher m = p.matcher(input);
//        if(m.find()&&m.group().equals(input)){
        if(m.find()){
            System.out.println(m.start());
//            System.out.println(m.start()+"...." + m.group());
        }else {
            System.out.println("Invalid mobile number");
        }
    }
}
