import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        if (n == 0) {
            return arr;
        }

        String[] strNums = br.readLine().split("\\s");

        for (int i = 0; i < strNums.length; i++) {
            arr[i] = Integer.parseInt(strNums[i]);
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int[] arr = takeInput();
            printArray(arr);
        }
    }
}