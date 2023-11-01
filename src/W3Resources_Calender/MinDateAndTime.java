package W3Resources_Calender;

import java.util.Calendar;

public class MinDateAndTime {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();

	System.out.println(calendar.getActualMinimum(Calendar.MONTH));
	System.out.println(calendar.getActualMinimum(Calendar.YEAR));
	System.out.println(calendar.getActualMinimum(Calendar.DATE));
	System.out.println(calendar.getActualMinimum(Calendar.WEEK_OF_MONTH));
        
    }
}
