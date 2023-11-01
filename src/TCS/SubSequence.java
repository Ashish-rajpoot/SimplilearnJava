package TCS;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static List<String> subSequence(String str) {

        if (str.isEmpty()) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        char firstChar = str.charAt(0);
        String remaining = str.substring(1);
        List<String> subString = subSequence(remaining);
        List<String> result = new ArrayList<>(subString);
        for (String sub : subString) {
            result.add(firstChar + sub);

        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        String str = "geeks";

subSequence(str);
    }
}
