package Streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintLimitValue {
    public static void main(String[] args) {
        List<Integer> list = new ValueList().listOfIntegers();
//        Collections.sort(list);
//        Collections.reverse(list);

        System.out.println(list);
        List<Integer> result = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(result);
        int sumOfFirstFiveNumber = list.stream().limit(5).reduce((a,b)->a+b).get();
        System.out.println(sumOfFirstFiveNumber);

        List<Integer> afterSkiping = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(afterSkiping);
    }
}
