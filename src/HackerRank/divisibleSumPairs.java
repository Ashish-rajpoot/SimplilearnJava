package HackerRank;

import java.util.Arrays;
import java.util.List;

public class divisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        if(ar.size()!=n){
            return 0;
        }
        // Write your code here
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i+1; j < ar.size(); j++) {
                if((ar.get(i)+ar.get(j))%k==0){
                System.out.println(ar.get(i)+ " " + ar.get(j));

                    count++;
                }

            }

        }
        System.out.println(count);
        return count;
    }



    public static void main(String[] args) {
//        List<Integer> ar = Arrays.asList(1,3,2,6,1,2);
        List<Integer> ar = Arrays.asList(92,91,27,20,9,43,73,39,24,54,33,64,27,47,32,58,76,78,33,57,5,22,89,78,64,48,41,39,74,33,45,16,16,72,8,42,52,15,64,86,31,73,87,46,30,86,89,67,82,7,91,8,64,32,97,77,31,32,74,40,70,77,56,25,50,8,61,58,1,30,93,66,15,53,64,1,56,69,3,28,26,76,78,38,5,60,43,30,100,58,4,59,78,85,48,89,74,12,54,38);
        int n = 100;
        int k = 31;
        divisibleSumPairs(n,k,ar);
    }
}
