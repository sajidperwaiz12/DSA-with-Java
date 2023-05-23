public class CarInsurance {
    private String make;
    private String model;
    private int year;
    private double premium;

    public CarInsurance(String make, String model, int year, double premium) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.premium = premium;
    }


    public double calculatePremium(int age, int tickets) {
        double newPremium = premium;
        if (age < 25) {
            newPremium += 1000;
        }
        if (tickets >= 1) {
            newPremium += 500 * tickets;
        }
        return newPremium;
    }

    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Premium: " + premium);
    }
}
