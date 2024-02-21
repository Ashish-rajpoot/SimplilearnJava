import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestSmallestPalindrome {

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static Set<String> generatePalindromes(String s1, String s2) {
        Set<String> allPalindromes = new HashSet<>();
        for (int length = 1; length <= Math.min(s1.length(), s2.length()); length++) {
            for (String perm1 : permute(s1.toCharArray(), length)) {
                for (String perm2 : permute(s2.toCharArray(), length)) {
                    String candidate = perm1 + perm2;
                    if (isPalindrome(candidate)) {
                        allPalindromes.add(candidate);
                    }
                }
            }
        }
        return allPalindromes;
    }

    public static Set<String> permute(char[] chars, int length) {
        Set<String> permutations = new HashSet<>();
        permuteHelper(chars, new boolean[chars.length], new StringBuilder(), permutations, length);
        return permutations;
    }

    public static void permuteHelper(char[] chars, boolean[] used, StringBuilder current, Set<String> permutations, int length) {
        if (current.length() == length) {
            permutations.add(current.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.append(chars[i]);
                permuteHelper(chars, used, current, permutations, length);
                current.deleteCharAt(current.length() - 1);
                used[i] = false;
            }
        }
    }

    public static String longestSmallestPalindrome(String s1, String s2) {
        Set<String> allPalindromes = generatePalindromes(s1, s2);
        Set<String> validPalindromes = new HashSet<>();
        for (String palindrome : allPalindromes) {
            boolean valid = true;
            for (char c : palindrome.toCharArray()) {
                if (s1.indexOf(c) == -1 || s2.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                validPalindromes.add(palindrome);
            }
        }
        if (validPalindromes.isEmpty()) {
            return null;
        }
        Set<String> longestPalindromes = new TreeSet<>(validPalindromes);
        return longestPalindromes.iterator().next();
    }

    public static void main(String[] args) {
        String s1 = "aaab";
        String s2 = "cca";
        String result = longestSmallestPalindrome(s1, s2);
        System.out.println(result);
    }
}
