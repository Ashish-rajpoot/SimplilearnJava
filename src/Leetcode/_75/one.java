package Leetcode._75;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class one {
    public static String mergeAlternately(String word1, String word2) {
//        Input: word1 = "abc", word2 = "pqr"
//        Output: "apbqcr"
//        Explanation: The merged string will be merged as so:
//        word1:  a   b   c
//        word2:    p   q   r
//        merged: a p b q c r
        List<String> str = new ArrayList<>();

        for (int i = 0; i < Math.max (word2.length(),word1.length()); i++) {
            if(word1.length()>i)
                str.add(String.valueOf(word1.charAt(i)));
            if(word2.length()>i)
                str.add(String.valueOf(word2.charAt(i)));
        }
      String st =  str.stream().collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString();
        return st;
//      String st =  str.stream().collect(StringJoiner::new,StringJoiner::add,StringJoiner::merge).toString();
//        String st = str.stream().reduce((s1,s2)->s1+s2).orElse("");
//        System.out.println(st);
//        return st;
    }

    public static void main(String[] args) {
        mergeAlternately("abcd","pqqqq");
    }
}
