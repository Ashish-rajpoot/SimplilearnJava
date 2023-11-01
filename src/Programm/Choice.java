package Programm;

import java.util.Scanner;

public class Choice {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while (true) {

            int choiceint = choiceMenu();
            switch (choiceint) {
                case 1:
                    System.out.println("You have selected Option 1");
                    break;
                case 2:
                    System.out.println("You have selected Option 2");
                    break;
                case 3:
                    System.out.println("You have selected Option 3");
                    break;
                case 4:
                    System.out.println("You have selected Option 4");
                    break;
                default:
                    System.out.println("Programm is Terminating");
                    sc.close();
                    break;
            }

            Thread.sleep(3000);
            choiceMenu();
        }
    }


    public static int choiceMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for cube");
        System.out.println("Press 2 for cube");
        System.out.println("Press 3 for cube");
        System.out.println("Press 4 for cube");
        return sc.nextInt();
    }
}
