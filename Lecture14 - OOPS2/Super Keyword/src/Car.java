public class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    @Override
    public void print() {
        super.print();
        System.out.println("Car numGears: " + numGears);
        System.out.println("Car isConvertible: " + isConvertible);
    }
}
