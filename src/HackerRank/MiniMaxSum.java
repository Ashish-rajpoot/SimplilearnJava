package HackerRank;

import java.util.*;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        // Write your code here
        List<Long> result = new ArrayList<>();
        long[] minMax = new long[2];
        for (int i = 0; i < arr.size();i++){
            long sum=0;
            for (int j = 0 ; j < arr.size();j++){
                sum += arr.get(j);
            }
            sum -= arr.get(i);
            result.add(sum);
        }
        Collections.sort(result);
        System.out.println(result);
        LinkedHashSet<Long> list = new LinkedHashSet<>(result);
        List<Long> finalList = new ArrayList<>(list);
        minMax[0] = finalList.get(0);
        minMax[1] = finalList.get(list.size()-1);
        System.out.print(minMax[0]);
        System.out.print(" ");
        System.out.print(minMax[1]);
    }

    public static void main(String[] args) {
    List<Integer> arr = Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279);
    miniMaxSum(arr);
    }
}
