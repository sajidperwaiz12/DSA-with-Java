public class Car extends Vehicle {
    int numGears;
    boolean isConvertible;

    public void printCar() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Speed: " + getMaxSpeed());
        System.out.println("Car numGears: " + numGears);
        System.out.println("Car isConvertible: " + isConvertible);
    }
}
