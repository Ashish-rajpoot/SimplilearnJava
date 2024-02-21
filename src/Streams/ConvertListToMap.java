package Streams;

import java.io.IOException;
import java.io.StringReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertListToMap {
    public static void main(String[] args) throws IOException {
        List<String> strs = Arrays.asList("Apple","ball","cat","dog","elephant","fist","Apple","ball","cat","dog","elephant","fist");

        List<Integer> integers = Arrays.asList(2,3,4,5,2,3,4,5,2,3,5,6);

        Map<Integer , String>  map = new TreeMap<>();
        map.put(10,"johlkajsd");
        map.put(1,"Alex");
        map.put(3,"John");
        map.put(2,"zlare");

//        System.out.println(map);
//
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
//        map.entrySet().stream().forEach(i-> System.out.println(i.getKey() + " " + i.getValue()));
//        Set set = map.entrySet();
//        set.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

//        integers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);


//        IntStream.range(0,strs.size()).map(Map<Integer,String>::new).

//        List<String> result = strs.stream().distinct().collect(Collectors.toList());
//        strs.stream().filter(i-> i.startsWith("A")).forEach(System.out::println);

//        System.out.println(result);
//        String srg = "Hello Java!! \nWelcome to Javatpoint.";
//        StringReader reader = new StringReader(srg);
//        int k=0;
//        while((k=reader.read())!=-1){
//            System.out.print((char)k);
//        }


}
}
