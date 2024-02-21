package HackerRank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Birthday {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        if (s.size() <= 1) {
            if (s.get(0) == d) {
                count++;
            }
        }
        if (m == 1 && s.size() > 1) {
            for (int i = 0; i < s.size(); i++) {
                if (s.get(i) == d) {
                    count++;
                }
            }
        }
        if (m > 1 && s.size() > 1) {
            for (int i = 0; i < s.size() -m+1; i++) {
                List<Integer> subString = s.subList(i, i + m);
                int sum = 0;
                for (int j = 0; j < subString.size(); j++) {
                    sum += subString.get(j);
                }
                if(sum==d){
                    count++;
            }

        }
    }
        System.out.println(count);
        return count;
}


    public static void main(String[] args) {
//        List<Integer> s = List.of(1,2,1,3,2);
//        List<Integer> s = List.of(2, 2, 1, 3, 2);
        List<Integer> s = List.of(4, 1, 4, 3, 3, 5, 1, 2, 4, 2, 5, 1, 5, 1, 4, 1, 3, 1, 5, 2, 2, 2, 1, 1, 3, 2, 5, 3, 1, 5, 4, 5, 2, 2, 1, 1, 2, 2, 4, 5, 4, 1, 5, 2, 1, 1, 2, 2, 1, 3, 2, 4, 4, 1, 3, 2, 2, 3, 1, 5, 4, 4, 1, 4, 2, 1, 2, 1, 5, 1, 3, 3, 4, 2, 1, 5, 5, 4, 2, 2, 3, 3, 4, 3, 1, 2, 1, 2, 4, 3);
//        List<Integer> s = List.of(4);
//        List<Integer> s = List.of(4, 3, 3, 3);
        int d = 16;
        int m = 7;

        birthday(s, d, m);
    }
}
