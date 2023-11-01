package Sanfoundary;

public class Recurssion {
    public static void main(String[] args) {

        int x = 0, y = 0, z = 2;

        Recurssion recurssion = new Recurssion();
        x = recurssion.recurr(121, 2,0);

        if (x == 1) {
            System.out.println("prime");
        } else {
            System.out.println("Not prime");
        }
    }

    int recurr(int a, int i, int count) {
        if (a > i) {
            if (a % 2 != 0) {
                count++;
                return recurr(a, ++i, count);
            } else {
                return 0;
            }
        }
        System.out.println(count);
        return 1;
    }
}
