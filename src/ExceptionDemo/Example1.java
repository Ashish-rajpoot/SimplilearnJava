package ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Inputs");
        try{
            System.out.println("Please Enter Your First Input");
            int a = scanner.nextInt();
            System.out.println("Please Enter Your Second Input");
            int b = scanner.nextInt();

            int c = a /b;
            System.out.println(c);
            scanner.close();
        }catch (InputMismatchException e){
            System.out.println("Please Enter only numbers");
        }catch (ArithmeticException e){
            System.out.println("you cannot devide by zero");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Your are in the finally block");
            scanner.close();
        }
    }
}
