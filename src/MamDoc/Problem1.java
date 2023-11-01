package MamDoc;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<String> findSubsequences(String input) {
        if (input.isEmpty()) {
            List<String> result = new ArrayList<>();
            result.add("");
            return result;
        }

        char firstChar = input.charAt(0);
        String remaining = input.substring(1);

        List<String> subResult = findSubsequences(remaining);

        List<String> result = new ArrayList<>(subResult);
        for (String sub : subResult) {
            result.add(firstChar + sub);
        }
//        System.out.println(result);
        return result;
    }
}
