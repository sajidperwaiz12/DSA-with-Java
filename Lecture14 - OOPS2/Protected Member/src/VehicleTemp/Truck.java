package VehicleTemp;

import Vehicle.Vehicle;

public class Truck extends Vehicle {
    public int maxLoadingCapacity;

    @Override
    public void print() {
        System.out.println("Truck Color: " + color);
        System.out.println("Truck Speed: " + getMaxSpeed());
        System.out.println("Truck maxLoadingCapacity: " + maxLoadingCapacity);
    }
}
