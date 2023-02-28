public class Increment {
    public static void main(String[] args) {
        int a = 10;
        increment(a);
        System.out.println(a);
        int[] arr = {1, 2, 3, 4, 5};
        incrementArray(arr);
        printArray(arr);
    }

    public static void increment(int a) {
        a++;
    }

    public static void incrementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    public static void printArray(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
