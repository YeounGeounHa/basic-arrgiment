package num1.exam03;


public class third {
    public static void main(String[] args){
        System.out.println("시작!");
        while (true) {
            int ran1 = (int)(Math.random()*6)+1;
            int ran2 = (int)(Math.random()*6)+1;


            if(ran1 + ran2 !=5){
                System.out.println("("+ran1+","+ran2+")");

            }
            else{
                System.out.println("("+ran1+","+ran2+")");
                break;
            }


        }
        System.out.println("끝!");
    }
}
