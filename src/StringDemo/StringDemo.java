package StringDemo;

import java.util.Arrays;

public class StringDemo {

    static void getDemo(){

        String s1 = "Hello";
        String s2 = "Hello    hello";
        System.out.println("s1==s2"+ (s1==s2));
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println("s1==s2"+ (s3==s4));

        System.out.println(s1.equals(s2));

        System.out.println(s1.replace("e","a"));
        System.out.println(s1);

        System.out.println(s1.length());
        System.out.println(s1.getBytes());
        System.out.println(s2.trim());
        System.out.println(s2);
        System.out.println(s1.describeConstable());
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
        System.out.println(s1.substring(3));
        System.out.println(s1.indexOf("z"));
        System.out.println(s1.toCharArray());
        System.out.println(Arrays.stream(s1.split("")).toArray());

    }

    public static void main(String[] args) {
        getDemo();
    }
}
