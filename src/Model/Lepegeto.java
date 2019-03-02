package Model;

public class Lepegeto extends Creature {
    public Lepegeto(String name, Integer waterAmount) {
        super(name, waterAmount);
        this.setMaxWater(12);
    }

    @Override
    public void napos() {
        this.setWaterAmount(getWaterAmount()-2);
        if(!isDead()) {
            this.setDistance(getDistance() + 1);
        } else {
            setAlive(false);
        }
    }

    @Override
    public void felhos() {
        this.setWaterAmount(getWaterAmount()-1);
        if(!isDead()) {
            this.setDistance(getDistance() + 2);
        } else {
            setAlive(false);
        }
    }

    @Override
    public void esos() {
        if(isWaterIncreasing(3)) {
            this.setWaterAmount(getWaterAmount() + 3);
        } else {
            this.setWaterAmount(getMaxWater());
        }
        this.setDistance(getDistance()+1);
    }
}
