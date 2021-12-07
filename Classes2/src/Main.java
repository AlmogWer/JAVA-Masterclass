public class Main {

    public static void main(String[] args) {
        Car porsche=new Car(4,4,"911","V8","Red");
//        Car holden=new Car();
        System.out.println(porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
        System.out.println(porsche.getEngine());
    }

}
