package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class AreaRactangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");

        BigInteger bigInteger = new BigInteger(input[0]);
        BigInteger bigInteger1 = new BigInteger(input[1]);

        System.out.println(bigInteger + " " + bigInteger1);
        System.out.println(bigInteger.multiply(bigInteger1));
    }
}
