package AmbitionBox;

import java.util.ArrayList;
import java.util.List;

public class Question2_gethematchofstring {


    public static boolean isMatch(String string, String match) {
        char[] charMatch = match.toCharArray();
        for (char c : charMatch) {
            boolean is = string.contains(String.valueOf(c));
//            boolean is = true;
            if (!is) {
                return false;
            }
        }
        return true;
    }

    public static String getLargestString(List<String> list) {
        String maxString = list.get(0);
        String minString = list.get(0);
        for (String str : list) {
            if (maxString.length() < str.length()) {
                maxString = str;
            }
            if(str.length() < minString.length()){
                minString = str;
            }
        }
        return minString;
    }

    public static String matchedStr(List<String> str, String match) {
        List<String> matched = new ArrayList<>();
        for (int i = 0; i < str.size(); i++) {
            boolean is = isMatch(str.get(i), match);
            if (is) {
                matched.add(str.get(i));
            }
        }
        if(matched.size()<=0){
            return "No Match Found";
        }
        String result = getLargestString(matched);
        return result;
    }

    public static String result(String string, String match) {
        List<String> listOfSubstring = new ArrayList<>();
        for (int i = 0; i < string.length() - 1; i++) {
            for (int j = i+1; j < string.length() - 1; j++) {
                listOfSubstring.add(string.substring(i, j));
            }
        }

       String result = matchedStr(listOfSubstring, match);
//        String result = "true";
        return result;
    }

    public static void main(String[] args) {
        String string = "ahffaksfajeeubsne";
        String match = "jefaa";
//        String string = "aaffhkksemckelloe";
//        String match = "fhea";

//        result(string,match);
//        isMatch(string, match);
//        System.out.println(listOfSubstring);

//        boolean isThere = Pattern.matches(match, string);
//        System.out.println(isMatch(string, match));
//        isMatch(string,match);

     String result =   result(string, match);
        System.out.println(result);
    }
}
