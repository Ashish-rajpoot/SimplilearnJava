package HackerRank;

import java.math.BigInteger;

public class isProbablePrimeMethod {

    public static void main(String[] args) {
    Integer  number = 1080815552;
    Integer  number2 = 108;
    BigInteger num = new BigInteger(String.valueOf(number));
    BigInteger num2 = new BigInteger(String.valueOf(number2));

    String number3 = "132123";
        System.out.println(Integer.parseInt(number3));

        System.out.println(num.gcd(num2));
//        System.out.println(num.remainder(num2));
//        System.out.println(num.max(num2));
//        System.out.println(num.bitLength());
//        System.out.println(num.equals(num2));
//        System.out.println(num2.hashCode());
//        System.out.println(num2.compareTo(num));
//        System.out.println(num.intValue());
        System.out.println(num.shiftLeft(12));
        System.out.println(num.shiftRight(12));
    if(num.isProbablePrime(10)){
        System.out.println("prime");
    }else {
        System.out.println("Not Prime");
    }

    }

}
