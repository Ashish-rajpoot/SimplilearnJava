package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    protected static String  kittyAndKatty(List<Integer> blocks){
        int result = 0;
        String  wins = "";
        List<Integer> resultArrya = new ArrayList<>(blocks);
        while (wins.isEmpty()) {
            if (resultArrya.size() > 2) {
                for (int i = 0; i < resultArrya.size() - 1; i++) {
                    int a = resultArrya.get(1);
                    int b = resultArrya.get(2);
                    int c = a - b;
                    resultArrya.remove(1);
                    resultArrya.remove(1);
                    resultArrya.add(1, c);
                }
            }
            if (resultArrya.size() < 4 && resultArrya.size() > 3) {
                int a = resultArrya.get(1);
                int b = resultArrya.get(2);
                int c = a - b;
                resultArrya.remove(1);
                resultArrya.remove(1);
                resultArrya.add(1, c);
            }
            if (resultArrya.size() < 3) {
                result = Math.abs((resultArrya.get(0) - resultArrya.get(1)) % 3);
                System.out.println(result);
                if (result == 1) {
                    wins = "kitty";
                }
                if (result == 2 || result == 0) {
                    wins = "Katty";
                }
            }
        }
        System.out.println(wins);
        return  wins;
    }

    public static void main(String[] args) {
        List<Integer> blocks = Arrays.asList(1,2,3,4,5,6,7,8);
        kittyAndKatty(blocks);
    }
}
