abstract class Dog {
    public void bark() {
        System.out.println("Bark!");
    }

    public abstract void poop();
}

class Chiuahua extends Dog {
    public void poop(){
        System.out.println("Dog pooped!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Chiuahua d = new Chiuahua();
        d.bark();
        d.poop();


    }
}
