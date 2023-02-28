import java.util.Scanner;

public class TripletSum {
    private static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int findTriplet(int arr[], int x) {
        //Your code goes here
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            int[] arr = takeInput();
            int x = s.nextInt();
            System.out.println(findTriplet(arr, x));
        }
    }
}
