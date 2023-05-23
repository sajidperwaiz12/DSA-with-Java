package Vehicle;

public class Vehicle {
    protected String color;
    private int maxSpeed;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void print() {
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle Speed: " + maxSpeed);
    }
}
