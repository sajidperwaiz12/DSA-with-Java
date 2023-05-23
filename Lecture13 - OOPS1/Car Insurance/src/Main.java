import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String make = s.next();
        String model = s.next();
        int year = s.nextInt();
        double premium = s.nextDouble();
        int age = s.nextInt();
        int tickets = s.nextInt();

        CarInsurance c = new CarInsurance(make, model, year, premium);
        c.printDetails();
        System.out.println("New Premium: " + c.calculatePremium(age, tickets));
    }
}
