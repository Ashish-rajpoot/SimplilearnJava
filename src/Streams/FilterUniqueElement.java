package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FilterUniqueElement {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Apple","Dob","Cat","Elephent","apple","Dob","Cat","Elephent");
        List<Integer> nums = Arrays.asList(1,2,1,2,43,34,64,6,43,346,765,7,54,5,564,1,2,1,2,43,34,64,6,43,346,765,7,54,5,564);

        strs.stream().map(String::toLowerCase).distinct().forEach(System.out::print);
        nums.stream().distinct().forEach(System.out::print);

    }
}
