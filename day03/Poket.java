package day03;

public class Poket {
    Integer x;
    Integer y;
    String name;
    Integer hp;
    Integer exp;
    Integer Damage;
    String type;
    Integer level;

    public Poket(String name, Integer hp, Integer exp, Integer Damage, String type, Integer level) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.Damage = Damage;
        this.type = type;
        this.level = level;
    }

    Integer levelUp() {
        level = level + 1;
        return level;
    }
    Integer expUp(){
        exp = exp + 10;

        if (exp >= 100) {
            exp = exp - 100;
        }
        return exp;
    }

    void move(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    Integer attacked(Integer Damage){
        this.hp = this.hp - Damage;

        if(hp <= 0)
            this.die();

        return hp;
    }

    void die() {
        this.recall();
        this.hp = 100;
    }

    void recall(){
        this.x = 0;
        this.y = 0;
    }

    void attackTo(Poket target) {
        target.attacked(this.Damage);
    }


}
