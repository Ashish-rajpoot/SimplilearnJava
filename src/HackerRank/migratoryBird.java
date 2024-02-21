package HackerRank;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class migratoryBird {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        List<Integer> numbers = Arrays.asList(1, 4, 4, 3, 4, 5, 3);

        // Use Collectors.groupingBy to group elements by their occurrences
//        Map<Integer, Long> occurrences = numbers.stream()
//                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        int result = numbers.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

//        System.out.println(occurrences);
//         Find the entry with the maximum occurrence using Stream.max
//        Map.Entry<Integer, Long> maxEntry = occurrences.entrySet().stream()
//                .max(Map.Entry.comparingByValue())
//                .orElse(null);
//
//         Print the result
//        if (maxEntry != null) {
//            System.out.println("Number with the maximum occurrence: " + maxEntry.getKey());
//            System.out.println("Occurrences: " + maxEntry.getValue());
//        } else {
//            System.out.println("List is empty");
//        }

    return result;
    }

    public static void main(String[] args) {
        List<Integer> x = Arrays.asList(1, 4, 4,3, 4, 5,3);
        migratoryBirds(x);
    }
}
