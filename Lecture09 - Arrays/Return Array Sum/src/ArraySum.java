import java.util.Scanner;

public class ArraySum {
    public static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int sum(int[] arr) {
        //Your code goes here
        int sum = 0;
        for (int ele: arr) {
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(sum(arr));
    }
}
