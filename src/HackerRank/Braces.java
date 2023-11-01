package HackerRank;

import java.util.Comparator;
import java.util.Stack;

public class Braces {
    public static void main(String[] args) {
        String braces = "{{}}([{}])}";
        char[] chars = braces.toCharArray();
        Stack<Character> input = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {

            if (braces.charAt(i) == '(' || braces.charAt(i) == '[' || braces.charAt(i) == '{') {
                input.push(braces.charAt(i));
            } else {
//                if (!input.empty()) {
                if (braces.charAt(i) == ')' || braces.charAt(i) == ']' || braces.charAt(i) == '}') {
                    if (braces.charAt(i) == ')' && input.peek() == '(' ) {
                        input.pop();
                    }else {
                        if (braces.charAt(i) == ']' && input.peek() == '[') {
                            input.pop();
                        }else {
                            if (braces.charAt(i) == '}' && input.peek() == '{') {
                                input.pop();
                            }else {
                                    input.push(braces.charAt(i));
                            }
                        }
                    }
                }
            }

        }

        System.out.println(input.toString());
        if (input.empty()) {
            System.out.println("Ok");
        } else {
            System.out.println("Not");
        }

    }
}
