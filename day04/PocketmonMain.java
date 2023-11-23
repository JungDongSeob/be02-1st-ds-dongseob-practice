package day04;

public class PocketmonMain {
    public static void main(String[] args) {
        Pocketmon pikachu = new Pocketmon(
                0,
                0,
                "피카츄",
                100,
                0,
                10,
                "전기",
                1
        );


        Pocketmon fairi = new Pocketmon(
                0,
                0,
                "파이리",
                100,
                0,
                15,
                "불",
                1);

        FlyingPocketmon pigeot = new  FlyingPocketmon(
                0,
                0,
                "피죤",
                100,
                0,
                8,
                "비행",
                1,
                0
        );

        System.out.println(pikachu.getHp());
        fairi.attack(pikachu);
        System.out.println(pikachu.getHp());

        System.out.println(pigeot.getHp());
        fairi.attack(pigeot);
        System.out.println(pigeot.getHp());

        pigeot.flying();
        fairi.attack(pigeot);
        System.out.println(pigeot.getHp());


    }
}
