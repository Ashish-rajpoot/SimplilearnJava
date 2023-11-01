package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Youtube {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,10,20,30,15);
        List<Integer> list = Arrays.asList(1,4,5,6,22,3,90,8,9,3,4,55,6,0,-1,4,6,8,9,8,9,55,0);
//        List<Integer> list = Arrays.asList(22, 124, 254, 2145, 212, 222, 45, 154, 126);


        //Get Sum of numbers;
//       Optional<Integer> sum =  list.stream().reduce((a, b)->a+b);
//        System.out.println(sum);

        //Get Average of numbers;
//       int x = (int) list.stream().mapToInt(e->e).average().getAsDouble();
//        System.out.println(Math.abs(x));
        //Get square + number > 100 + average
//        double list1 = list.stream().map((i)-> i * i).filter((i)->i>100).mapToInt(i->i).average().getAsDouble();
//        System.out.println(list1);
        //Get Even and Odd;
//        List<Integer> even = list.stream().filter((i)->i%2==0).collect(Collectors.toList());
//        System.out.println(even);
//        List<Integer> odd = list.stream().filter((i)->i%2==1).collect(Collectors.toList());
//        System.out.println(odd);
        //Get the number starts with certain number;
//        List<Integer> list1 = list.stream()
//                .map(i -> String.valueOf(i))
//                .filter(i->i.startsWith("2")).map(Integer::parseInt)
//                .collect(Collectors.toList());
//        System.out.println(list1);

        //Get the duplicate numbers
                // Method 1:
//        Set<Integer> list1 = list.stream().filter(e-> Collections.frequency(list,e)>1).collect(Collectors.toSet());
//        System.out.println(list1);
                // Method 2:
//        Set<Integer> list1  = new HashSet<>();
//       Set<Integer> result = list.stream().filter(i->!list1.add(i)).collect(Collectors.toSet());
//        System.out.println(result);
//        System.out.println(list1);

        // Get Max and Min number
//        int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
//        System.out.println(max);
//        int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
//        System.out.println(min);



    }
}
