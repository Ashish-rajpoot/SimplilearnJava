package InterviewCodingQuestions;

public class StringPalidrome {
    public static void main(String[] args) {
        String str = "abcaba";
        for (int i = 0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("Not Palindrom");
                return;
            }else {
                System.out.println("Palindrom");
            }
        }
    }
}
