import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a > b) {
            System.out.println(a + " is largest number");
        } else {
            System.out.println(b + " is largest number");
        }
    }
}
