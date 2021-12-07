package Challenge;

public class Car extends Vehicle{
    private String model;
    private int gear;

    public Car(int speed, String direction, int wheels, String model, int gear) {
        super(speed, direction, wheels);
        this.model = model;
        this.gear = gear;
    }

    public String getModel() {
        return model;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear){

    }
}
