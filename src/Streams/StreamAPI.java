package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("geek","for","god","a computer","go","apple");
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5,5);
//
//       Optional<Integer> number =  list1.stream().max(Integer::compareTo);
//        System.out.println(number.get());

//        Stream.iterate(2, (Integer n) -> n * n).limit(5).forEach(System.out::println);
//        Stream.generate(Math::random).limit(10).forEach(System.out::println);
//        Pattern p = Pattern.compile("^g");
//
//        list.stream().filter(p.asPredicate()).forEach(System.out::println);


//        Employee emp1 = new Employee(1,25);
//        Employee emp4 = new Employee(1,26);
//        Employee emp3 = new Employee(1,32);
//        Employee emp2 = new Employee(1,33);

//        List<Employee> list2 = new ArrayList<>();
//        list2.add(emp1);
//        list2.add(emp2);
//        list2.add(emp3);
//        list2.add(emp4);



//        Stream.of(Employee::getAge).forEach((i)-> System.out.println(i.intValue()+5));
//        list1.stream().filter((i)-> i % 2 ==0).forEach(System.out::println);

//        List<String> list2 = Arrays.asList("apple","ball","go","to","so"," ");

//      List<String> result =  list2.stream().filter((String i) -> i.length()>1 ).collect(Collectors.toList());
//        System.out.println(result);

//      String l1 =  list2.stream().map((String::toUpperCase)).collect(Collectors.joining(","));
//        System.out.println(l1);
//
//       List<Integer> result = list1.stream().distinct().map((n)->n*n).collect(Collectors.toList());
//        System.out.println(result);

        String str = "abskjdf2l2k3424j324l#@$@%^$%ljjaslff@#$@#llsjajfsdl";
        char[] chars = str.toCharArray();
        int strs= 0;
        int numb = 0;
        int special = 0;

        for( char x : chars){
            if(Character.isAlphabetic(x)){
                strs++;
            }
             if(Character.isDigit(x)){
                numb++;
            }
            if(!Character.isAlphabetic(x) && !Character.isDigit(x)) {
                special++;
            }
        }
        System.out.println(strs + " " + numb +" "+ special);

        }
}
