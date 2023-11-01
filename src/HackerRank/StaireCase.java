package HackerRank;

public class StaireCase {

    protected static void stairecase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n  ; j > i+1 ; j--) {
                System.out.print(" ");
            }
            for(int k = 0 ; k <= i ; k++)
                System.out.print("#");
                System.out.println();
        }
    }

    public static void main(String[] args) {
        stairecase(5);
    }
}
