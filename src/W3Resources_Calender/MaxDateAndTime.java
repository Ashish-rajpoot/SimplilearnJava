package W3Resources_Calender;

import java.util.Calendar;

public class MaxDateAndTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getActualMaximum(Calendar.YEAR));
        System.out.println(calendar.getActualMaximum(Calendar.MONTH));
        System.out.println(calendar.getActualMaximum(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.getActualMaximum(Calendar.DATE));
    }
}
