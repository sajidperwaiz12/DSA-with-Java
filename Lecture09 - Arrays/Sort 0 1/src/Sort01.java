import java.util.Scanner;


public class Sort01 {
    private static Scanner s = new Scanner(System.in);

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

    public static void sort01(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;
        while (si < ei) {
            if (arr[si] == 0) {
                si++;
            } else {
                if (arr[ei] == 1) {
                    ei--;
                } else {
                    swap(arr, si, ei);
                    si++;
                    ei--;
                }
            }
        }
    }

    public static void swap(int[] arr, int si, int ei) {
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            int[] arr = takeInput();
            sort01(arr);
            printArray(arr);
        }
    }
}
