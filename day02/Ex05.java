package day02;

public class Ex05 {
    public static void main(String[] args) {
        Integer []arrInt = new Integer[10];

        for (int i = 0; i < 10; i++) {
            arrInt[i] = (int)(Math.random()*10+1);
            System.out.println(arrInt[i]);
        }
        int sum =0;
        for (int i = 0; i < 10; i++) {
            sum = sum + arrInt[i];
        }
        System.out.println(sum);
    }
}
