package day03;

public class FlyablePoket extends Poket {
    public FlyablePoket(String name, Integer hp, Integer exp, Integer Damage, String type, Integer level) {
        super(name, hp, exp, Damage, type, level);
    }

    Integer z;

    void takeoff(Integer z) {
        this.z = z;
    }


    @Override
    void recall() {
        this.x=0;
        this.y=0;
        this.z=0;
    }
}
