package LearnRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question {
    public static void main(String[] args) {
        // in input file extract all the number and store in a array
        String input  = "i am alex my number are 8723452322, 919623492123. i am jhon my numbers are 8089235231, 08532552123";

        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher(input);
        List<String> numbers = new ArrayList<>();
       while (m.find() && m.group().length()<=12){
           System.out.println(m.start()+"...." + m.group());
            numbers.add(m.group());
       }

       numbers.stream().forEach(System.out::println);
    }
}
