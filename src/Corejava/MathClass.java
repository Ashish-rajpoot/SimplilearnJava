package Corejava;

public class MathClass {
    public static void main(String[] args) {
        int a = 10, b = 20;
        double c = 10.4;

        System.out.println("Math Max" +Math.max(a,b));
        System.out.println("Math Abs" +Math.abs(a));
        System.out.println("Math Min" +Math.min(a,b));
        System.out.println("Math Ceil " +Math.ceil(c));
        System.out.println("Math Floor " +Math.floor(c));
        System.out.println("Math power "+ Math.pow(3,2));
        System.out.println("Math round " + Math.round(c));
        System.out.println("Math MultiplyExact " +Math.multiplyExact((int) c,b));
        System.out.println("Math Expo " + Math.exp(a));
        System.out.println("Math Expo1 " + Math.getExponent(a));


    }
}
