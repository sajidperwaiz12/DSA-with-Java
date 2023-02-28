public class Increment {
    public static void increment(int n) {
        n = n  +1;
    }

    public static void main(String[] args) {
        int a = 10;
        increment(a);
        System.out.println(a);
    }
}
