package InterviewCodingQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ashish";

//        Stream.of(str).map(String::toCharArray).forEach(System.out::println);


        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
//        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
//        System.out.println(stringBuilder.toString());

        String reverseString = new StringBuilder(
                IntStream.range(0, str.length()).mapToObj(x -> str.charAt(str.length() - 1 - x))
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString()).toString();


        System.out.println(reverseString);
    }

}
