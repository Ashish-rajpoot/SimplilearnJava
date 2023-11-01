package W3Resources_Calender;

import java.util.Calendar;

public class DefaultDateAndTime {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Day "+calendar.getTime().getDay());
        System.out.println("Month "+ calendar.getTime().getMonth());
        System.out.println("Date "+ calendar.getTime().getDate());
        System.out.println("Hours "+ calendar.getTime().getHours());
        System.out.println("Minutes "+ calendar.getTime().getMinutes());
        System.out.println("Second "+ calendar.getTime().getSeconds());
        System.out.println("Year "+ calendar.getTime().getYear());

    }
}
