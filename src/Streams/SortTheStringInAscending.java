package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheStringInAscending {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("apple","ball","cat","dog","apple","dog","cat","ball");

        //get the character at position index 2 of all the strings
//        listOfString.stream().map(i->i.charAt(2)).forEach(System.out::println);
        List<String> sortedList = listOfString.stream().sorted().collect(Collectors.toList());
//
//        System.out.println(listOfString);
        System.out.println(sortedList);
//
//        for (int i = 0; i < listOfString.size()-1; i++) {
//                if(listOfString.get(0).compareTo(listOfString.get(5))<1){
////                    System.out.println(listOfString.get(i));
//                    System.out.println(listOfString.get(i).compareTo(listOfString.get(i+1)));
//
//            }
//
//        }
    }
}
