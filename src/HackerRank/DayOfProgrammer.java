package HackerRank;

import java.util.Calendar;
import java.util.Date;

public class DayOfProgrammer {
    public static void main(String[] args) {
        int year = 1900;

//        Calendar c = Calendar.getInstance();
//        c.set(2017,0,1);
////        System.out.println(c.getTime());
//        int month = c.getActualMaximum(Calendar.MONTH);
//        int data = c.getActualMaximum(Calendar.DATE);
//        System.out.println(data);
            int[] expection = new int[]{1800,1900,1918,1700};
            for(int x : expection){
            System.out.println("12.09."+x);
            }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("leap");
            System.out.println("12.09."+year);
        } else {
            System.out.println("13.09."+year);
        }
    }
}
