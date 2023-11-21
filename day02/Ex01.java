package day02;

public class Ex01 {
    public static void main(String[] args) {
        Integer sum=0;
        for (Integer i = 0; i < 100; i++) {
            sum = sum + i;
        }
        System.out.printf("총합 : %d", sum);
    }
}
