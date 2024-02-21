package CollectionFramework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CF_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        IntStream.range(100, 110)
                .mapToObj(i -> hashMap.put(i, " Mr-"+(1000+(int)((Math.random()*1000)))))
                .collect(Collectors.toList());

//        hashMap.entrySet()
//                .stream().forEach(System.out::println);


        hashMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .forEach(System.out::println);


        System.out.println(hashMap.containsValue(" mr-105"));

        System.out.println(hashMap.containsValue(" Mr-105"));

        System.out.println(hashMap.containsKey(102));

        hashMap.put(102,"name change");

        System.out.println(hashMap.get(102));

//        System.out.println(hashMap.keySet());
//        for (Map.Entry m : hashMap.entrySet()){
//            int num = (int) m.getKey();
//            System.out.println(num==102);
//        }

        System.out.println(hashMap.remove(101).trim());

        System.out.println(hashMap.containsKey(101));

        System.out.println(hashMap);
        hashMap.clear();




    }
}
