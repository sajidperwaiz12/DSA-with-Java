import java.util.Scanner;

public class Swap {
    public static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            int[] arr = takeInput();
            swapAlternate(arr);
            printArray(arr);
        }
    }

    public static void swapAlternate(int[] arr) {
        //Your code goes here
        for (int i = 0; i <= arr.length - 2; i += 2) {
            swap(arr, i, i + 1);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
