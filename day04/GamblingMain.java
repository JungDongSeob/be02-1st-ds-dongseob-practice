package day04;

public class GamblingMain {

    public static void main(String[] args) {
        Gambling player1 = new Gambling("player1", 5, 0);
        Gambling player2 = new Gambling("player2", 5, 0);

        System.out.println(player1.toString());
        System.out.println(player2.toString());

        System.out.println("게임을 시작하지");

        while (true) {

            System.out.println("player1아 골라라");
            player1.selectNumber();
            System.out.println("player2야 골라라");
            player2.selectNumber();

//            selectNumber(player1);
//            selectNumber(player2);
        }
    }
}
