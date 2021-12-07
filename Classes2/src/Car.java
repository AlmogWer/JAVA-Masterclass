public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public void setModel(String model){
     this.model=model;
 }

 public String getModel(){
     return this.model;
 }
 public String getEngine(){
        return this.engine;
 }
}
