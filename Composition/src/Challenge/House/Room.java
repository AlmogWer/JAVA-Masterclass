package Challenge.House;

public class Room {
    private int walls;
    private boolean window;
    private boolean lights;

    public Room(int walls, boolean window, boolean lights) {
        this.walls = walls;
        this.window = window;
        this.lights = lights;
    }

    public boolean lightSwitch(){
       return !this.lights;
    }

    public int getWalls() {
        return walls;
    }

    public boolean isWindow() {
        return window;
    }

    public boolean getLights() {
        return lights;
    }
}
