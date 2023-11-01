package HackerRank;

public class Kangaroo {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
    String result = "";
        int kangaroo1 = x1;
        int kangaroo2 = x2;
        if(x1 > x2 || x1 > 10000 || x2 > 10000 || x2 < 0 || x1 < 0){
            result = "NO";
        }

        for(int i = 0; i <= 10000 ; i++){
             kangaroo1 += v1;
             kangaroo2 += v2;

            if(kangaroo2==kangaroo1){
                result = "YES";
                break;
            }else {
                result="NO";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        kangaroo(0,3,4,2);
    }
}
