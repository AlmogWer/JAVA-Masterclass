public class Switch {
    public static void main(String[] args) {
        int value=1;
        if(value==1){
            System.out.println("Value was 1");
        }else if(value==2){
            System.out.println("Value was 2");
        }else{
            System.out.println("was not 1 or 2 ");
        }

        int switchValue=4;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case4: case5:
            System.out.println("was 3,4,5");
            break;
            default:
                System.out.println("Was not 1 or 2");
        }

        String month="January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;

        }

        char switchChar='F';
switch(switchChar){
    case 'A':
        System.out.println("A");
        break;
    case 'B':
        System.out.println("B");
        break;
    case 'C':
        System.out.println("C");
        break;
    case 'D':
        System.out.println("D");
        break;
    case 'E':
        System.out.println("E");
        break;
    default:
        System.out.println("Not Found");
}
    }

}
