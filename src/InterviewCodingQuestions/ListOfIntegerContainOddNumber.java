package InterviewCodingQuestions;

import java.util.Arrays;
import java.util.List;

public class ListOfIntegerContainOddNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 3, 5, 9, 423, 423, 423, 423);
//        for (int x : list){
//            if(x%2==0){
//                System.out.println("List Contain Even Number");
//                return;
//            }
//        }
//        System.out.println("List Contain only Odd number");


        boolean y = list.parallelStream().anyMatch(x -> x % 2 != 0);
        System.out.println(y);

        boolean z = list.stream().anyMatch(x -> x % 2 != 0);
        System.out.println(z);

    }
}
