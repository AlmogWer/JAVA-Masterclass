package Operators;

public class Operators {
    public static void main(String[]args){
        int result =1+2;//1+2=3
        System.out.println("1+2 = "+result );
        int previousResult=result;
        System.out.println("previousResult= "+previousResult);
        result=result-1;//3-1 =2
        System.out.println("3-1= "+result);
        System.out.println("previousResult= "+previousResult);

        result=result*10;//2*10=20
        System.out.println("2*10= "+result);

        result=result/5;//20/5=45
        System.out.println("20/5= "+result);

        result = result % 3;// the remainder of (4 %3 )= 1
        System.out.println("4%3= "+result);

        //result=result+1;
        result++;//1+1=2
        System.out.println("1+1= "+result);

        result--;//2-1=1
        System.out.println("2-1= "+result);

//        result=result+2;
        result+=2; //1+2=3
        System.out.println("1+2= "+result);

        //result=result*10
        result*=10;//3*10=30
        System.out.println("3*10= "+result);

        //result=result/3
        result/=3;//30/3=10
        System.out.println("30/3= "+result);

        //result=result-2
        result-=2;//10-2=8
        System.out.println("10-2= "+result);

        boolean isAlien=false;
        if(isAlien==false){
            System.out.println("it is not an alien!");
            System.out.println("Aliens");
        }

        int topScore=80;
        if(topScore<100){
            System.out.println("You got the high score!");
        }

        int secondTopScore=85;
        if((topScore>secondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if((topScore>90)|| (secondTopScore<=90)){
            System.out.println("Either or both of the condition are true");
        }

        int newValue=50;
        if(newValue==50){
            System.out.println("This is true");
        }

        boolean isCar=false;
        if(isCar){
            System.out.println("This is not supposed to happen ");

        }

        isCar=true;
        boolean wasCar=isCar?true:false;
        if (wasCar){
            System.out.println("Wascar is true ");
        }

        double var1=20.00d;
        double var2=80.00d;
        double var3=100.00d*(var1+var2);
        System.out.println("My values total= "+var3);
        double var4=var3%40.00d;
        System.out.println("theRemainder= "+var4);
        boolean isZero=var4==0?true:false;
        System.out.println(isZero);
        if(!isZero){
            System.out.println("Got some reminder");
        }
    }
}
