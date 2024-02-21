package AmbitionBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Question1_Array {

    public static void main(String[] args) {
        List<Integer> arr = List.of(0,1,2,3,2,5,5,6);
//        int n = 10;
//        IntStream.range(0,n-2).forEach();
//        System.out.println();

//        arr.stream().filter(i-> Collections.frequency(arr,i)>1).distinct().forEach(System.out::println);
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i)== arr.get(j)){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
