import java.util.Scanner;

public class Unique {
    private static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int findUnique(int[] arr){
        //Your code goes here
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    break;
                }
            }
            if (j == arr.length) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int t = s.nextInt();
        while (t-- > 0) {
            int[] arr = takeInput();
            System.out.println(findUnique(arr));
        }
    }
}
