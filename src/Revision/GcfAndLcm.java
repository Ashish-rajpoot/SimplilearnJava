package Revision;

public class GcfAndLcm {

    static int gcf(int x , int y){
        if(y == 0){
            return x;
        }
      return   gcf(y , x % y);
    }

    static  void  factors(int number){
        for(int i = 1 ; i <= number ; i++){
            if(number%i==0){
                System.out.println("Factors " + i);
            }
        }
    }

    static  int lcm(int x ,int y ){
        int result = (x * y) / (gcf(x,y));
        return  result;
    }

    public static void main(String[] args) {
        int x = 14;
        int y = 3;

        System.out.println("lcm " + lcm(x, y) );

    }
}
