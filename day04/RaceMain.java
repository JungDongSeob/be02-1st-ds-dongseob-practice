package day04;

import java.util.Scanner;

public class RaceMain {
    public static void main(String[] args) {
        int max = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차의 수를 입력해라 ");
        int carNum = sc.nextInt();
        String[] carName = new String[carNum];

        sc.nextLine();

        for (int i = 0; i < carNum; i++) {
            //carName[i] = sc.nextLine();
            System.out.println("5자 이하로 경주할 자동차의 이름을 입력해라 ");
            carName[i] = sc.nextLine();
            if (carName[i].length() > 5) {
                System.out.println("5자가 넘습니다.");
                i = i - 1;
            }
        }

        Race[] racer = new Race[carNum];
        for (int i = 0; i < carNum; i++) {
            racer[i] = new Race(carName[i]);
        }

        System.out.println("몇 번 이동할거니? ");
        int moveNum = sc.nextInt();
//        for(int i=0; i<10; i++)
//            System.out.println("carName = " + carName[i]);
        //String[] carName = new String[carNum];

        for (int i = 0; i < moveNum; i++) {
            System.out.println(i + 1 + "차수");
            for (int j = 0; j < carNum; j++) {
                racer[j].moveOrStop();
                System.out.println(carName[j] + " : " + racer[j].getStatus());
            }
        }
        max = racer[0].getStatus().length();
        for (int i = 0; i < carNum; i++) {
            if (max < racer[i].getStatus().length())
                max = racer[i].getStatus().length();
        }
        for (int i = 0; i < carNum; i++) {
            if (max == racer[i].getStatus().length()) {

                //    System.out.println(racer[i].getCarName());
                System.out.print("최종 우승자 : ");
                System.out.print(carName[i] + " ");
            }
        }
    }
}
