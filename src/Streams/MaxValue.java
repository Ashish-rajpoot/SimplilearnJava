package Streams;

import java.util.*;

public class MaxValue {
    public static void main(String[] args) {

        List<Integer> listOfNum = Arrays.asList(20,23,25,23,32,35,645,77);

        listOfNum.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
        listOfNum.stream().sorted(Comparator.naturalOrder()).skip(listOfNum.size()-1).forEach(System.out::println);
        int i = listOfNum.stream().min(Comparator.reverseOrder()).get();
        System.out.println(i);
    }
}
