package LearnRegex;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
//        String  s = "String token seperate";
//
//        StringTokenizer stringTokenizer = new StringTokenizer(s);
//        while (stringTokenizer.hasMoreTokens()){
//            System.out.println(stringTokenizer.nextToken());
//        }

        String date = "27-03-1998";

        StringTokenizer stringTokenizer = new StringTokenizer(date,"-");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
