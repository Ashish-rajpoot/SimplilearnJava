package Leetcode._75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode_75_1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();

        int lengthOfCandies = candies.length;
       return Arrays.stream(candies).mapToObj(i->{
            if( i + extraCandies >= max)
                return true;
            else
                return false;
        }).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
    }

    public static void main(String[] args) {
//        System.out.println( gcdOfStrings("LEET" ,"CODE"));
        System.out.println(  kidsWithCandies(new int[]{12,1,12},10));

    }
}
