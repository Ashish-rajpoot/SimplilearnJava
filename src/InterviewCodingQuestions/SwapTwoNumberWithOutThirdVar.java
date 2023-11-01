package InterviewCodingQuestions;

import java.util.stream.Stream;

public class SwapTwoNumberWithOutThirdVar {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b; // a= 30
        b = a - b; // b = a - b = 10;
        a = a - b; // a = a - b = 20;

        System.out.println(a + " " + b);
    }
}
