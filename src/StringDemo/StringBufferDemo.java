package StringDemo;

public class StringBufferDemo {

    public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Hello");
        System.out.println(sb.length());
        sb.insert(1,"ashishasishishsh");
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
    }
}
