import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets {
    private static boolean find(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }
        return false;
    }

    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || find(expression.charAt(i))) {
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                boolean hasOperator = false;

                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    hasOperator = true;
                }
                if (!hasOperator) {
                    return true;
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = s.next();
        System.out.println(checkRedundantBrackets(expression));
    }
}
