package Methods.BarkingDog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(barking==true&&(hourOfDay<0||hourOfDay>=22)){
            return false;
        }
        else if(barking==true &&(hourOfDay<8||hourOfDay<=23)){
            return true;
        }
        return false;
    }
}
