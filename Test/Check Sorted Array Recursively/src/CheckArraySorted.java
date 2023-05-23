public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 18, 7, 8, 9};
        System.out.println(checkSortedArray(arr));
    }

    public static boolean checkSortedArray(int[] arr) {
        return checkSortedArray(arr, 0);
    }

    public static boolean checkSortedArray(int[] arr, int si) {
        if (si == arr.length - 1) {
            return true;
        }

        if (arr[si] > arr[si + 1]) {
            return false;
        } else {
            return checkSortedArray(arr, si + 1);
        }
    }
}
