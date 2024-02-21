package Leetcode._75;

import Streams.StreamAPI;

import java.math.BigInteger;
import java.nio.file.StandardOpenOption;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LeetCode_75_1071 {
//    public static String gcdOfStrings(String str1, String str2) {
//
//        int len1 = str1.length();
//        int len2 = str2.length();
//        BigInteger gcd = BigInteger.valueOf(len1).gcd(BigInteger.valueOf(len2));
//        int num = Integer.parseInt(String.valueOf(gcd));
//        return str2.substring(0,num);
//    }
//
//    public  int gcd (int a ,int b){
//        while ( b != 0){
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }




    public static void main(String[] args) {
//        System.out.println( gcdOfStrings("LEET" ,"CODE"));

        System.out.println(gcd(27,6));
    }
}
