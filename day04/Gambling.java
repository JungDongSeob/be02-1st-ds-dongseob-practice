package day04;

import java.util.Scanner;

import static java.lang.System.exit;

public class Gambling {
    private String name;
    private static int heart;
    private int score;
//    private int choice;

    public int getScore() {
        return score;
    }

    public int setScore() {
        this.score = this.score + 1;
        return this.score;
    }

    public int getHeart() {
        return heart;
    }

    public int setHeart() {
        heart = heart - 1;
        return heart;
    }

    void downScore() {
        this.score = getScore();
        if (this.score != 0)
            this.score = this.score - 1;
        System.out.println("점수 : " + this.score);
    }

    void upScore() {

        this.score = setScore();
        this.score = getScore();

        if (this.score == 3) {
            System.out.println(name + "승리");
            System.exit(0);
        }
        System.out.println("점수 : " + this.score);
        System.out.println("목숨 : " + heart);
    }

    void downHeart() {
        this.heart = setHeart();
        this.heart = getHeart();
        System.out.println("목숨 : " + heart);
        if (this.heart == 0) {
            System.out.println("죽었습니다.");
            System.exit(0);
        }
    }

    public void selectNumber() {

        int[] arrInt = new int[3];
        int count = 0;
        while (count != 3) {
            int randomNumber = (int) (Math.random() * 3 + 1);
            for (int i = 0; i < count; i++) {
                //System.out.println(randomNumber);
                if (arrInt[i] == randomNumber) {
                    randomNumber = (int) (Math.random() * 3 + 1);
                    i = -1;
                }
            }
            arrInt[count] = randomNumber;
            count = count + 1;
        }
        for (int a = 0; a < 3; a++)
            System.out.print(arrInt[a] + " ");

        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println("숫자를 선택해라!");
        int numInt = sc.nextInt();

        if (arrInt[numInt - 1] == 1) {       // 1성공 2꽝 3폭탄
            upScore();
        } else if (arrInt[numInt - 1] == 2) {
            System.out.println("점수 : " + this.score);
            downHeart();
        } else if (arrInt[numInt - 1] == 3) {
            downScore();
            downHeart();
        } else {
            System.out.println("다시선택해라 임마");
            //continue;
        }
    }

    //    public int selectChoice (){
//        int[] num = {1,2,3};
//        return 0;
//    }
    @Override
    public String toString() {
        return "Gambling{" +
                "name='" + name + '\'' +
                ", heart=" + heart +
                ", score=" + score +
                '}';
    }

    public Gambling(String name, int heart, int score) {
        this.name = name;
        this.heart = heart;
        this.score = score;
    }
}

