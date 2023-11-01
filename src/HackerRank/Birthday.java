package HackerRank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Birthday {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < s.size()-m;i++){
                int sum = 0;
            for(int j = i ; j < m+i ;  j++){
                System.out.println(j +" " + j+1);
                sum = s.get(i) + s.get(j+1) ;
                if(sum == d){
//                System.out.println(sum + " " + d);
                    sum=0;
                    count++;
                }
            }

        }
//        System.out.println(count);
       return count;
    }


    public static void main(String[] args) {
        List<Integer> s = List.of(2, 2, 1, 3, 2);
        int d = 4;
        int m = 3;

        birthday(s, d, m);
    }
}
