package day02;

import java.awt.*;
import java.util.Scanner;
class Ex06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Day = {"월", "화", "수", "목", "금", "토", "일"};

        Integer num = sc.nextInt();

        if (num >= 0 && num <= 6) {
            System.out.println(Day[num]);
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}
