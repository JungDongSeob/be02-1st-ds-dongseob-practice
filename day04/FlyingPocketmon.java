package day03;

public class FlyingPocketmon extends Pocketmon {
    private int z;

    public int getZ() {
        return z;
    }

    public FlyingPocketmon(int x, int y, String name, int hp, int exp, int attackDamage, String type, int level, int z) {
        // super() 부모 클래스의 생성자 호출
        super(x, y, name, hp, exp, attackDamage, type, level);
        this.z = z;
    }

    @Override
    int attacked(int attackDamage) {
        if(z==0) {
            // super. 부모 객체를 의미
            super.attacked(attackDamage);
        } else {
            System.out.println("안맞지롱");
        }
        return this.hp;
    }

    int flying() {
        if(this.z < 10) {
            this.z = this.z + 10;
            System.out.println(this.name + " 하늘로 도망감");
        }

        return z;
    }
    int landing() {
        if(this.z > 0) {
            this.z = this.z - 10;
            System.out.println(this.name + " 땅으로 내려옴");
        }

        return z;
    }
}
