public class FunctionOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a) {
        return a + 1;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(sum(a));
        System.out.println(sum(a, b));
        System.out.println(sum(10.3, 5.6));
    }
}
