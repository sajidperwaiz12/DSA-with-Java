import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        int target = 19;
        System.out.println(linearSearch(arr, target));

        int[] a = {2, 3, 1, 4, 4, 5};
        target = 4;
        findAllIndices(a, target, 0);
        System.out.println(ans);
    }

    public static int linearSearch(int[] arr, int target) {
        return linearSearch(arr, target, 0);
    }

    public static int linearSearch(int[] arr, int target, int si) {
        if (si == arr.length) {
            return -1;
        }

        if (arr[si] == target) {
            return si;
        } else {
            return linearSearch(arr, target, si + 1);
        }
    }

    static ArrayList<Integer> ans = new ArrayList<>();
    public static void findAllIndices(int[] arr, int target, int si) {
        if (si == arr.length) {
            return;
        }

        if (arr[si] == target) {
            ans.add(si);
        }

        findAllIndices(arr, target, si + 1);
    }
}
