package InterviewCodingQuestions;

public class FebbonacciNumber {
    public static void main(String[] args) {
        int n = 10; // Change this to generate n Fibonacci numbers
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
       int[] febbo = new int[n];
       febbo[0] = 0;
       febbo[1] = 1;
       for(int i = 2; i<n; i++){
           febbo[i] = febbo[i-1] + febbo[i-2];
       }

       for (int x : febbo){
           System.out.print(x +  " ");
       }
    }
}
