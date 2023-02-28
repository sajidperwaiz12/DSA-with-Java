import java.util.Scanner;

public class ArrangeNumbers {
    public static Scanner s = new Scanner(System.in);

    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int si = 0;
        int ei = n - 1;
        int num = 1;
        while (si <= ei) {
            if (si == ei) {
                arr[si++] = num++;
                break;
            }
            arr[si++] = num++;
            arr[ei--] = num++;
        }
    }

    public static void printArray(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            arrange(arr, n);
            printArray(arr);
        }
    }
}
