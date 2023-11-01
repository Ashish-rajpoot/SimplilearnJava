package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheArrayASCandDSC {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 5, 6, 22, 3, 90, 8, 9, 3, 4, 55, 6, 0, -1, 4, 6, 8, 9, 8, 9, 55, 0);

//        List<Integer> Asc1 = list.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
//        List<Integer> Asc2 = list.stream().sorted().collect(Collectors.toList());
        List<Integer> Dec1 = list
                .stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList());
//        List<Integer> Dec2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(Dec1);
    }
}
