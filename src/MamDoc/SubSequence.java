package MamDoc;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public static List<String> subString(String str){

        List<String > result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                result.add(str.substring(i,j+1));
            }
        }
        System.out.println(result);
        return result;
    }

    public static List<String> subSequ(String str) {
        if (str.isEmpty()) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        List<String> subString = subSequ(remaining);
        List<String> result = new ArrayList<>(subString);
        for (String sub : subString) {
            result.add(firstChar + sub);
        }
        System.out.println(result);
        return result;
    }

    public static String palidrone(String x) {
        if (x.length() < 6 || x.length()%2==1)
            return null;
            for (int i = 0; i < x.length() / 2; i++) {
                if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
                    return null;
                }
            }
        return x;
    }

    public static void subs(String x, String y) {
//        maria
//        mira
//        List<String> strX = new ArrayList<>(subSequ(x));
//        List<String> strY = new ArrayList<>(subSequ(y));
        List<String> strX = new ArrayList<>(subString(x));
        List<String> strY = new ArrayList<>(subString(y));

        List<String> smallerList = (strX.size() < strY.size() ? strX : strY);
        List<String> largerList = (strX.size() > strY.size() ? strX : strY);
        for (int i = 0; i < x.length(); i++) {
            strX.add(x.substring(i));
        }
        for (int i = 0; i < y.length(); i++) {
            strY.add(y.substring(i));
        }

        String largestPalindrome = "";
        for (int i = 0; i < largerList.size(); i++) {
            for (int j = 0; j < smallerList.size(); j++) {
                String str1 = largerList.get(i).concat(smallerList.get(j));
                String str2 = smallerList.get(j).concat(largerList.get(i));
                String z = palidrone(str2);
                if (z != null) {
                    System.out.println(z);
//                       if(largestPalindrome.length()<z.length()){
//                           largestPalindrome=z;
//                       }
//                       System.out.println("found");
                }
//                str = "";
            }
        }
        System.out.println(largestPalindrome);
    }

    public static void main(String[] args) {
        subs("maria", "mira");
//subSequ("maria");
//        System.out.println(palidrone("aaira"));

//        System.out.println("maira".contains("ari"));
//        subString("geeks");
    }
}
