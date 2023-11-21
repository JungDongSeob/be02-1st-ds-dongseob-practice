package day02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arrInt = new Integer[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1 + "번째 숫자 입력 : ");
             arrInt[i] = sc.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(arrInt[i]);
        }


    }
}
