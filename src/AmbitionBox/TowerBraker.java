package AmbitionBox;

public class TowerBraker {

    public static int towerBreakers(int n, int m) {

       int result = (m == 1 || n % 2 == 0 ? 2 : 1);
        return result;
    }

    public static void main(String[] args) {
//        towerBreakers(1,4);
        System.out.println(towerBreakers(2, 2));
    }


}
