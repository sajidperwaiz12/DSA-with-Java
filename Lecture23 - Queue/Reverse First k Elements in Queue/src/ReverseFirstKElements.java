import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        if (input.isEmpty() || k <= 0 || k > input.size()) {
            return input;
        }

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < k; i++) {
            s.push(input.poll());
        }

        while (!s.isEmpty()) {
            input.add(s.pop());
        }

        for (int i = 0; i < input.size() - k; i++) {
            input.add(input.poll());
        }

        return input;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        Queue<Integer> input = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            input.add(s.nextInt());
        }
        input = reverseKElements(input, k);
        while (!input.isEmpty()) {
            System.out.print(input.poll() + " ");
        }
    }
}
