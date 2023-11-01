package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
            int count = 0;
            int max = candles.get(0);
        for (int i = 0 ; i < candles.size(); i++){
            if(max < candles.get(i) ) {
                max = candles.get(i);
            }
        }
        for (int i = 0 ; i < candles.size(); i++){
            if(max == candles.get(i) ) {
                count++;
            }
        }

        System.out.println(count);

        return count;
    }

    public static void main(String[] args) {
        List<Integer> candels = Arrays.asList(3,2,3,1,3,3,4,4);

        birthdayCakeCandles(candels);
    }
}
