package W3Resources_Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalenderClassCreateDate {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date (in any format):");
        String dateStr = scanner.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat();
        Date date = null;

        SimpleDateFormat[] formats = {
                new SimpleDateFormat("yyyy-MM-dd"),
                new SimpleDateFormat("MM/dd/yyyy"),
                new SimpleDateFormat("dd-MM-yyyy"),
                // Add more formats as needed
        };

        for (SimpleDateFormat format : formats) {
            try {
                date = format.parse(dateStr);
                break; // Exit loop if parsing is successful
            } catch (ParseException ex) {
                // Continue to the next format
            }
        }

        if (date != null) {
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
            String formattedDate = outputFormat.format(date);
            System.out.println("Formatted Date: " + formattedDate);
        } else {
            System.out.println("Unable to parse the date. Please try again.");
        }

        Calendar  calendar = Calendar.getInstance();
        calendar.clear();
            calendar.setTime(date);
//        System.out.println(calendar.getTime().getDay());
//        System.out.println(calendar.getTime().getMonth());
//        System.out.println(calendar.getTime().getDate());
//        System.out.println(calendar.getTime().getHours());
//        System.out.println(calendar.getTime().getMinutes());
//        System.out.println(calendar.getTime().getSeconds());
//        System.out.println(calendar.getTime().getYear());
//        System.out.println(calendar.getTime().toLocaleString());


        System.out.println(calendar.getTime());
//
//        System.out.println(calendar.getActualMaximum( Calendar.YEAR));
//        System.out.println(calendar.getActualMaximum( Calendar.MONTH));
//        System.out.println(calendar.getActualMaximum( Calendar.WEEK_OF_MONTH));
//        System.out.println(calendar.getActualMaximum( Calendar.DATE));
    }
}
