package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerProblem2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        BigInteger aa = new BigInteger(String.valueOf(a));
        BigInteger bb = new BigInteger(String.valueOf(b));

        System.out.println(aa.add(bb));
        System.out.println(aa.multiply(bb));

    }

}
