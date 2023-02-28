import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                if (arr[i] == arr[i + 1]) {
                    arr[i] *= 2;
                    arr[i + 1] = 0;
                }
            }
        }

//        int si = 0;
//        int ei =  arr.length - 1;
//        while (si < ei) {
//            if (arr[si] != 0) {
//                si++;
//            } else {
//                if (arr[ei] == 0) {
//                    ei--;
//                } else {
//                    int temp = arr[si];
//                    arr[si] = arr[ei];
//                    arr[ei] = temp;
//                    si++;
//                    ei--;
//                }
//            }
//        }



        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;




        System.out.println(Arrays.toString(arr));
    }
}
