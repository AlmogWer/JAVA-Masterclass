package Challenge;

public class Vehicle {
    private int speed;
    private String direction;
    private int wheels;

    public Vehicle(int speed, String direction, int wheels) {
        this.speed = speed;
        this.direction = direction;
        this.wheels = wheels;
    }



    public int getSpeed() {
        return speed;
    }

    public String getSteer() {
        return direction;
    }

    public int getWheels() {
        return wheels;
    }
}
