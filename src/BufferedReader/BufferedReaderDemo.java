package BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {


    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n;
//        try{
//            System.out.println("Enter the number of terms in the series");
//            n = Integer.parseInt(br.readLine());
//        }catch (Exception e){
//            System.out.println("An error occurred");
//            return;
//        }
//        double sum = 0;
//        double i;
//        for(i=1; i<=n;i++){
//            sum +=(1/i);
//        }
//        System.out.println("The sum is " + sum);
//


//        Programm 2

//        InputStreamReader fr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(fr);
//        System.out.println("type 'stop' to terminate the programm");
//        String input = "";
//        while (!input.equals("stop")) {
//            System.out.println("enter you data");
//            input = br.readLine();
//            System.out.println("data : " + input);
//        }
//        br.close();
//        fr.close();

//        Programm 1

//        InputStreamReader fr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(fr);
//        System.out.println("Enter your name");
//        String name = br.readLine();
//        System.out.println("Welcome " + name);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String  str = bufferedReader.readLine();
        String str2 = str.trim();

        System.out.println(str.replace(" ",","));
        System.out.println(str.toString());
//        int ints = bufferedReader.read();
//        System.out.println(str instanceof String);
//        System.out.println(ints );
    }
}
