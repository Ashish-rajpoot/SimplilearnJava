package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CalculateSumOfSquares {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);

//        Stream.iterate(2,(Integer n)-> n * n).limit(5).forEach(System.out::println);
        integers.stream().map(i-> i * i).reduce((a,b)-> a + b).stream().forEach(System.out::println);

        int sumOfSqr = 0;
        for (int i = 0; i < integers.size(); i++) {
            int sqr = integers.get(i) * integers.get(i);
            sumOfSqr+=sqr;
        }
        System.out.println(sumOfSqr);
    }
}
