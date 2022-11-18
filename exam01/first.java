package num1.exam01;

public class first {
    public static void main(String[] args) {

        int var1 = 5;
        int var2 = 2;
        double var3 = (double)var1/(double)var2; //위에 정수로 나온값을 서로 나누면 2로 나오기 때문에 double로 강제 타입변환 시켜야함
        int var4 = (int)(var3*var2);

        System.out.println(var4);

    }
}
