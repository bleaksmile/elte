package Model;

public class Szivacs extends Creature {
    public Szivacs(String name, Integer waterAmount) {
        super(name, waterAmount);
        this.setMaxWater(20);
    }

    @Override
    public void napos() {
        this.setWaterAmount(getWaterAmount()-4);
        if(isDead()){
            this.setAlive(false);
        }
    }

    @Override
    public void felhos() {
        this.setWaterAmount(getWaterAmount()-1);
        if(!isDead()) {
            this.setDistance(getDistance() + 1);
        } else {
            this.setAlive(false);
        }
    }

    @Override
    public void esos() {
        if(isWaterIncreasing(6)) {
            this.setWaterAmount(getWaterAmount() + 6);
        } else {
            this.setWaterAmount(getMaxWater());
        }
        this.setDistance(getDistance()+3);
    }
}
