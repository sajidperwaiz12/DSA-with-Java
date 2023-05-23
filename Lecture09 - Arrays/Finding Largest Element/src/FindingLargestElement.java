import java.util.Scanner;

public class FindingLargestElement {
    public static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele: arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(largestElement(arr));
    }
}
