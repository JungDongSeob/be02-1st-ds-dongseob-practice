package day02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer []arrInt = new Integer[10];

        for (int i = 0; i < 10; i++) {
            arrInt[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < 10; i++) {
            sum = sum + arrInt[i];
        }
        System.out.println((double)sum/arrInt.length);
    }
}
