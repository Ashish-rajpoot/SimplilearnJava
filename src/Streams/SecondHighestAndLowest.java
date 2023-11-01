package Streams;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestAndLowest {
    public static void main(String[] args) {
        List<Integer> list = new ValueList().listOfIntegers();
        Collections.frequency(list,5);
        System.out.println(Collections.frequency(list,5));
        System.out.println(list);
        List<Integer> list1 = list.stream().sorted().distinct().collect(Collectors.toList());
       int num = list1.stream().skip(list1.size()-2).findFirst().get();
        System.out.println(num);


    }
}
