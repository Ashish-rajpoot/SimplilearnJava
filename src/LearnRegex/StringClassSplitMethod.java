package LearnRegex;

public class StringClassSplitMethod {
    public static void main(String[] args) {
        String s = "www.google.com";
        String[] result = s.split("[.]");
        for (String s1 : result){
            System.out.println(s1);
        }
    }
}
