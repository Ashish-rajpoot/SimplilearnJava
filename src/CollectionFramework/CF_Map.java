package CollectionFramework;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CF_Map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(3,"julia");
        map.put(4,"john");
        map.put(5,"john");
        map.put(6,"alex");
        map.put(1,"alex");
        map.put(2,"adam");

        System.out.println(map);
        Set set = map.entrySet();

        //
//        Iterator itr = set.iterator();
//        while (itr.hasNext()){
//            Map.Entry mapEntry = (Map.Entry)itr.next();
//            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
//        }

        // iterate by for loop
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

//       set.stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//       set.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
