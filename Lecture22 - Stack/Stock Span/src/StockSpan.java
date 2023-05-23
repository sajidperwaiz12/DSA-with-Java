import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static int[] stockSpan(int[] price) {
        //Your code goes here
        Stack<Integer> stack = new Stack<>();
        int n = price.length;

        int[] ans = new int[n];

        stack.push(0);
        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] < price[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = s.nextInt();
        }

        int[] ans = stockSpan(price);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
