package JavaLearning;

    import java.util.ArrayList;
import java.util.List;

    public class UniqueCombinationChecker {

        public static List<String> stringOperation(String[] start, String[] fin) {
            List<String> result = new ArrayList<>();

            for (String targetStr : fin) {
                boolean isUnique = false;
                for (String sourceStr : start) {
                    if (isUniqueCombination(targetStr, sourceStr)) {
                        isUnique = true;
                        break;
                    }
                }
                result.add(isUnique ? "YES" : "NO");
            }

            return result;
        }

        public static boolean isUniqueCombination(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            int diffCount = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    diffCount++;
                    if (diffCount > 1) {
                        return false;
                    }
                }
            }

            return diffCount == 1;
        }

        public static void main(String[] args) {
            // Example usage:
            String[] start = {"abc", "bcc", "aaa"};
            String[] fin = {"acc", "aba"};

            List<String> result = stringOperation(start, fin);
            for (String res : result) {
                System.out.println(res);
            }
        }
    }
