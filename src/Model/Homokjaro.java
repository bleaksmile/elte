package Model;

public class Homokjaro extends Creature {

    public Homokjaro(String name, Integer waterAmount) {
        super(name, waterAmount);
        this.setMaxWater(8);
    }

    @Override
    public void napos() {
        this.setWaterAmount(getWaterAmount() - 1);
        if (!isDead()) {
            this.setDistance(getDistance() + 3);
        } else {
            this.setAlive(false);
        }

    }

    @Override
    public void felhos() {
        this.setDistance(getDistance() + 1);
    }

    @Override
    public void esos() {
        if (isWaterIncreasing(3)) {
            this.setWaterAmount(getWaterAmount() + 3);
        } else {
            this.setWaterAmount(getMaxWater());
        }
    }
}
