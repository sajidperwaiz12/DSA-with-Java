public class Scope {
    public static void main(String[] args) {
        int a = 10;
        a = 100;
        if (a >= 100) {
            int b = 10;
            System.out.println(b);
        } else {
            int c = 20;
            int b = 20;
            System.out.println(c);
        }
        System.out.println(a);
    }
}
