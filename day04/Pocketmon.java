package day04;

public class Pocketmon {
    int x;
    int y;
    String name;
    private int hp;
    int exp;
    int attackDamage;
    String type;
    int level;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp>100) {
            hp = hp % 100;
        }
        this.hp = hp;
    }

    public Pocketmon(int x, int y, String name, int hp, int exp, int attackDamage, String type, int level) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.attackDamage = attackDamage;
        this.type = type;
        this.level = level;
    }

    int levelUp() {
        this.level = this.level + 1;
        this.hp = this.hp * 110 / 100;
        this.attackDamage = this.attackDamage * 110 / 100;

        return level;
    }

    int expUp() {
        this.exp = this.exp + 10;
        if(this.exp >= 100) {
            this.levelUp();
            this.exp = this.exp % 100;
        }
        return exp;
    }

    int attacked(int attackDamage) {
        this.hp = this.hp - attackDamage;

        return this.hp;
    }

    void attack(Pocketmon target) {
        target.attacked(this.attackDamage);
    }
}
