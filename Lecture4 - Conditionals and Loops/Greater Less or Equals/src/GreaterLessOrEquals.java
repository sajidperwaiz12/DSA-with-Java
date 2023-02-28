import java.util.Scanner;

public class GreaterLessOrEquals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a > b) {
            System.out.println("First number is greater");
        } else if (a < b) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
