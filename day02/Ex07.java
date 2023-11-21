package day02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int [] unit = {50000,10000,5000,1000,500,100,50,10,5,1};
        // 50000으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 10000으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 5000으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 1000으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 500으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 100으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 50으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 10으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 5으로 나눈 몫은 더하고 나머지를 구함
        // 다시 나머지를 1으로 나눈 몫은 더하고 나머지를 구함
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하세요");
        Integer intNum = sc.nextInt();

        Integer []result = new Integer[10];

        for (int i = 0; i < 10; i++) {
            if (intNum >= unit[i]) {
                result[i] = intNum/unit[i];
                intNum = intNum%unit[i];
            } else {
                result[i] = 0;
            }
            System.out.println(unit[i] + "원 짜리는 " + result[i] + "개");
        }
    }
}
