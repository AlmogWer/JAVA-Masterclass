package Methods.MethodOverloading;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDuration(65,45));
        System.out.println(getDuration(3945));
    }

    public static String getDuration(int minutes,int seconds){
        if(minutes<0||seconds<0||seconds>59){
            System.out.println("Invalid Value");
        }
        int hours=minutes/60;
        int remainingMinutes=minutes%60;
        return hours+"h "+remainingMinutes+ "m " + seconds+ "s";

    }
    public static String getDuration(int seconds){
        if(seconds<=0){
            return "Invalid Value";
        }
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        return getDuration(minutes,remainingSeconds);
    }


}
