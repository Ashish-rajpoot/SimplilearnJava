package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountApplesAndOranges {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        List<Integer> appleFalledDistance = new ArrayList<>();
        List<Integer> orangeFalledDistance = new ArrayList<>();
        int appleRange=0;
        int orangeRange=0;
       for(int i = 0; i < apples.size();i++){
           int temp = apples.get(i)+a;
           appleFalledDistance.add(i,temp);
           if(temp>=s && temp<=t)
               appleRange++;
       }
        for(int i = 0; i < oranges.size();i++){
            int temp = oranges.get(i)+b;
            orangeFalledDistance.add(i,temp);
            if(temp>=s && temp<=t)
                orangeRange++;
        }
        System.out.println(appleRange);
        System.out.println(orangeRange);

    }

    public static void main(String[] args) {
        List<Integer> apple= Arrays.asList(-22,3,-4);
        List<Integer> orange = Arrays.asList(3,-2,-4);
        countApplesAndOranges(-7,10,4,12,apple,orange);
    }
}
