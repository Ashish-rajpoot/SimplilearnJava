package HackerRank;

import java.util.List;

public class BillDistribute {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
//      int result = (int) bill.stream().filter(i->i!=bill.get(k)).mapToInt(e->e).average().getAsDouble();
       int result1 = bill.stream().filter(i->i!=bill.get(k)).reduce((x,y)-> x+y).get()/2;
        if(result1-b==0){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(b-result1);
        }


    }

    public static void main(String[] args) {
        List<Integer> bill = List.of(3,10,2,9);
        int k = 1;
        int b = 12;

        bonAppetit(bill,k,b);
    }
}
