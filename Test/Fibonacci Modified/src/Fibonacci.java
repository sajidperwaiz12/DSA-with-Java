public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        return (int) (Math.ceil(Math.pow(((1 + Math.sqrt(5)) / 2), n)) / Math.sqrt(5)) - (int) (Math.ceil(Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }
}
