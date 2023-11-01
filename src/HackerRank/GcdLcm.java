package HackerRank;

public class GcdLcm {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println("a % b " +b+" "+ a % b);
        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        System.out.println("gcd "+ gcd(14,3));
//        System.out.println("lcm : "+ (102 * 15) / (gcd(102 , 15)));
//      int a = 36;
//      int b = 102;
//      while (b == 0){
//
//              b = a % b;
//              b = a;
//          System.out.println( "21"+a);
//      }
//        System.out.println(a);
    }
}
