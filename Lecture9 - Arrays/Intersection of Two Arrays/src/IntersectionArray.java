import java.util.Scanner;

public class IntersectionArray {
    public static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void intersections(int arr1[], int arr2[]) {
        //Your code goes here
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr2[j] = Integer.MIN_VALUE;
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            intersections(arr1, arr2);
        }
    }
}
