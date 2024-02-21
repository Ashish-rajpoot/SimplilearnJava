package Digitalocean;

public class FibonacciRecursion {

    //    3
//
    public static int fibo(int x) {
        if (x == 0)
            return 0;
        if (x <= 2)
            return 1;
        return fibo(x - 1) + fibo(x - 2);

    }

    public static void main(String[] args) {
        int x = fibo(9);
        System.out.println(x);
    }
}
