package Sanfoundary;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        PrimeNumber obj = new PrimeNumber();
        x = obj.prime(n, 2);
        if(x == 1)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
    }
    int prime(int y,int i) {
        if (i < y) {
            if (y % i != 0) {
                System.out.println("line 26 "+ i+" " + y);
                return (prime(y, ++i));
            } else {
                System.out.println("line 28");
                return 0;
            }
        }
                System.out.println("line 32");
        return 1;
    }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int s1 = scanner.nextInt();
//        System.out.println("Enter second Number");
//        int s2 = scanner.nextInt();
//
//        for(int i = s1 ; i<= s2;i++){
//            if((i % 2) !=0){
//                System.out.println(i);
//            }
//        }
//
//        scanner.close();
//    }

}
