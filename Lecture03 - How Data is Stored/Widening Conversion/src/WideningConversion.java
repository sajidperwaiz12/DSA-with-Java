public class WideningConversion {
    public static void main(String[] args) {
        int i = 2147483647;
        long l = i;
        l = l + 1;
        double d = l;
        System.out.println("Int value : " + i);
        System.out.println("Long value : " + l);
        System.out.println("Double value : " + d);
    }
}
