package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CountTheOccurrences {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 2, 5, 2, 5, 3, 6, 7);

        List<Integer> occurence = integers.stream()
                .mapToInt(i -> Collections.frequency(integers, i))
                .mapToObj(i -> i).collect(Collectors.toList());
//      List<Integer> occurence =  integers.stream().mapToInt(i-> Collections.frequency(integers,i)).forEach(System.out::println);
        System.out.println(occurence);


        List<Integer> occur = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < integers.size(); j++) {
                if (integers.get(i) == integers.get(j)) {
                    count++;
                }
            }
            occur.add(count);
            count = 0;
        }
        System.out.println(occur);
    }
}
