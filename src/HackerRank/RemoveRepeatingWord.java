package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveRepeatingWord {
    public static void main(String[] args) {
        String str = "Goodbye bye bye world world world";
//        String str = "Hello hello Ab aB";
//        Pattern p = Pattern.compile("\\w+");
//        Matcher m = p.matcher(str);
//        str.matches("\\w+");
        List<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
//        while (m.find()){
//            list.add(m.group());
//            System.out.println(m.group());
//        }
        list.stream().distinct().forEach(System.out::println);
//        list.stream().map(i->Collections.frequency(list,i)>1).forEach(System.out::print);
//        System.out.println(list);
    }
}
