package Digitalocean;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberIsPrime {
    public static void main(String[] args) {
        int num = 9;

        boolean isPrime = IntStream.range(2,num).noneMatch(i->num%i==0);
        System.out.println(isPrime);
    }
}
