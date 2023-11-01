package HackerRank;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static String timeConversion(String s) throws ParseException {
        // Write your code here
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ssa");

            Date date = simpleDateFormat.parse(s);
            String hours = ""+date.getHours();
            String minutes = ""+date.getMinutes();
            String seconds = ""+date.getSeconds();
            if (date.getHours() < 10) {
                hours = "0" + date.getHours();
            }  if (date.getMinutes() < 10) {
                minutes = "0" + date.getMinutes();
            }  if (date.getSeconds() < 10) {
                seconds = "0" + date.getSeconds();
                if (date.getSeconds() == 0) {
                    seconds = "0" + date.getSeconds();
                }
            }
            String result = hours + ":" + minutes + ":" + seconds;
            System.out.println(result);
            return result;

        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws IOException, IOException, ParseException {
        String time = "07:00:00AM";

        timeConversion(time);


    }
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = TimeConversion.timeConversion(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
}
