import java.util.Scanner;

public class LinearSearch {
    public static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int linearSearch(int[] arr, int x) {
        //Your code goes here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            int[] arr = takeInput();
            int x = s.nextInt();
            System.out.println(linearSearch(arr, x));
        }
    }
}
