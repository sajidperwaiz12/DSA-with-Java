import java.util.Scanner;
import java.util.Stack;

public class CountBracketReversals {
    public static int countBracketReversals(String input) {
        //Your code goes here
        if (input.length() % 2 != 0) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{') {
                stack.push('{');
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push('}');
                    }
                } else {
                    stack.push('}');
                }
            }
        }

        int count = 0;
        while (!stack.isEmpty()) {
            char c1 = stack.peek();
            stack.pop();
            char c2 = stack.peek();
            stack.pop();

            if (c1 == c2) {
                count++;
            } else {
                count = count + 2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(countBracketReversals(input));
    }
}
