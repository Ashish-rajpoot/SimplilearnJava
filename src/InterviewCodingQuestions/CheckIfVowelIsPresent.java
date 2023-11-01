package InterviewCodingQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckIfVowelIsPresent {
    public static void main(String[] args) {
        String str = "alkjsdfl";
        String str1 = "aeiou";

//        for(int i = 0; i < str.length(); i++){
//            for (int j= 0; j < str1.length();j++){
//               if( str.charAt(i)==str1.charAt(j)){
//                   System.out.println("yes");
//                   return;
//               }else {
//                   System.out.println("No");
//               }
//            }
//        }

        //second Method
       boolean x = Pattern.compile("[ibd]").matcher(str).find();
        System.out.println(x);
    }
}
