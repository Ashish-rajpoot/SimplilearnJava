package HackerRank;

import java.math.BigInteger;
import java.util.*;

public class BigIntegerProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        List<String > inputList = List.of("9 -100 50 0 56.6 90 0.12 .12 02.34 000.000".split(" "));
//        sc.close();
        while (sc.hasNext()) {
        String input = sc.next();
            String[] inputList = input.split(" ");
            List<String> storedList = new ArrayList<>();
            for (String x : inputList)
                storedList.add(x);
            Collections.sort(storedList);
            Collections.reverse(storedList);
//        BigInteger bigInteger = new BigInteger("9 -100 50 0 56.6 90 0.12 .12 02.34 000.000");
            int v = 0;
            while (v < storedList.size()) {
                System.out.println(storedList.get(v));
                v++;
            }
        }
    }
}
