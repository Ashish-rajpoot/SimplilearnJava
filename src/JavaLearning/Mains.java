package JavaLearning;

import java.util.*;

public class Mains {

    public static List<String> isUniqueCombination(String source, String target) {
        char[] sourceChars = source.toCharArray();
        char[] targetChars = target.toCharArray();

        Arrays.sort(sourceChars);
        Arrays.sort(targetChars);

        if (Arrays.equals(sourceChars, targetChars)) {
            return Collections.singletonList("YES");
        } else {
            return Collections.singletonList("NO");
        }
    }

    public static void main(String[] args) {
        String source = "aaaaa";
        String target = "acacac";

        List<String> result = isUniqueCombination(source, target);
        System.out.println(result.get(0)); // Output: YES
    }
}
