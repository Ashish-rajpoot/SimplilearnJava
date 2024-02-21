package LearnRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExpression {
    public static void main(String[] args) {
        //kumar_alex.234@gmail.com
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]([.][a-zA-Z0-9]+)+");

        // kumar_alex.234@gmail.com ==== gmail.com 'only'
        Pattern pgmail = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com");

        // kumar_alex.234@yahoo.co.in ==== yahoo.co.in 'only'
        Pattern pyahoo_co_in = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@yahoo[.]co[.]in");

        String input ="kumar_alex.234@gmail.com";
        Matcher m = p.matcher(input);
        if(m.find()&&m.group().equals(input)){
            System.out.println("valid mail id");
        }else {
            System.out.println("invalid Mail id");
        }

    }
}
