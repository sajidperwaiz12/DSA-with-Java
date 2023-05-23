public class ArrayUse {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[3] = 15;
        System.out.println(arr[3]);
//        arr[10] = 10;       // Array index out of bound exception
        System.out.println(arr[0]);  // by default elements at all indices of the integer array will be initialised to 0

        char[] chArr = new char[11];
        double[] dArr = new double[12];
        System.out.println(chArr[0]);
        System.out.println(dArr[0]);
    }
}
