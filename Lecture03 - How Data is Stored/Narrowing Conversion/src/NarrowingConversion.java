public class NarrowingConversion {
    public static void main(String[] args) {
        double d = 25.123;
        int i = (int) d;
        byte b = (byte) i;
        System.out.println("Double value : " + d);
        System.out.println("Int value : " + i);
        System.out.println("Byte value : " + b);
    }
}
