package ConstructorChallenge;

public class Main {
    public static void main(String[] args) {
        VipCostumer Almog=new VipCostumer("Almog",50.5,"Almog@Almog.com");
        VipCostumer Almog2=new VipCostumer();

        System.out.println(Almog.getName());
        System.out.println(Almog2.getEmail());
    }

}
