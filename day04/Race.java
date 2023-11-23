package day04;

public class Race {
    private String status="";
    private int randomInt;
    private String carName;

    public String getStatus() {
        return this.status;
    }

    public String getCarName() {
        return carName;
    }

    void moveOrStop(){
        randomInt = (int)(Math.random()*10);
        System.out.println(randomInt);
        if (randomInt >= 4) {
            this.status = this.status + "-";
        }
        //System.out.println(raceStatus());
    }
    String raceStatus(){
        return this.status;
    }
    public Race(String name){}
}
