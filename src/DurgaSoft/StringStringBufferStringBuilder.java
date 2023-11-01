package DurgaSoft;

public class StringStringBufferStringBuilder {

    public static void main(String[] args) {

        // String
    String s = new String("Durga");
    s.concat("Software");
        System.out.println("line 9 : "+ s);

        // String Buffer
        StringBuffer stringBuffer = new StringBuffer("Durga");
        stringBuffer.append("Software");
        System.out.println("line 15 : " + stringBuffer);


    }
}
