package Vehicle;

public class Car extends Vehicle {
    int numGears;
    boolean isConvertible;
    @Override
    public void print() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Speed: " + getMaxSpeed());
        System.out.println("Car numGears:" + numGears);
        System.out.println("Car isConvertible: " + isConvertible);
    }
}
