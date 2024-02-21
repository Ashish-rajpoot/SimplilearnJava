package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class CalculateAverage {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,14,15);
        nums.stream().reduce((a,b)-> a+ b).stream().map(i-> i / nums.size()).forEach(System.out::println);
        int ave=(int) nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
//         nums.stream().mapToInt(Integer::intValue).forEach(System.out::println);
        System.out.println(ave);
    }
}
