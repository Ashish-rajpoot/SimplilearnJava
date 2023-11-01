package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b =0;
        try{
            System.out.println("Enter first Number");
            a = scanner.nextInt();
            System.out.println("Enter Second Number");
            b = scanner.nextInt();

        }catch (Exception e){
            System.out.println("error occured");
        }
        int c;
        c = a + b;
        System.out.println(c);

        scanner.close();
    }
}
