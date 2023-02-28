import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        String[] strNums = br.readLine().split("\\s+");
        for (int i = 0; i < size; i++) {
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