package num1.exam02;

public class second {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        int z = (++x)+(y--); //부호가 앞에 있으면 더한뒤에 x에 저장 뒤에 있으면 먼저 y값을 20으로 저장한뒤 빼고 y에 저장

        System.out.println(z);
    }
}
