package InterviewCodingQuestions;

import java.util.Arrays;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        String str = "how are you dear?";

//        String result =  Arrays.stream(str.split(" "))
//                .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
//                .toString();
//        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        String [] strings = str.split(" ");
        for (String x : strings){
            sb.append(x);
        }
        System.out.print(sb);

    }
}
