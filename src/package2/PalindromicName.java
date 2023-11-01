package package2;
import modifiers.classA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

    public class PalindromicName {

        public static String palindromicString(String father, String mother) {
            for (int i = 0; i < father.length(); i++) {
                for (int j = 0; j < mother.length(); j++) {
                    String substring1 = father.substring(i);
                    String substring2 = mother.substring(j);
                    String combined = substring1 + substring2;
                    if (isPalindrome(combined)) {
                        return "YES";
                    }
                }
            }
            return "NO";
        }

        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static void main(String[] args) {
            String father = "maria";
            String mother = "mira";

            String result = palindromicString(father, mother);
            System.out.println(result); // Output: YES
        }
    }

//    public static void main(String[] args) {
//        ClassC c = new ClassC();
//        System.out.println(c.);

//        List<Integer> list = Arrays.asList(4,6,322,72,12);
//        Collections.sort(list);
////        System.out.println(list.get(list.size()-2));
//
//     int first =   list.stream().sorted().distinct().skip(list.size()-2).findFirst().get();
//        System.out.println(first);
//    }

