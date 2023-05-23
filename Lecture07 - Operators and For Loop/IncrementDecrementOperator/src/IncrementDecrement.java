public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 60;
        System.out.println(a++);
        System.out.println(++a);
        int b = 60;
        System.out.println(b--);
        System.out.println(--b);

        int x = 60, y = 80;
        if (x++ > 60 && y++ > 80) {
            System.out.println("Inside if");
        } else {
            System.out.println("Inside else");
        }
        System.out.println(x + " " + y);
    }
}
