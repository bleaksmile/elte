package Model;

public abstract class Creature {
    private String name;
    private Integer waterAmount;
    private Integer maxWater;
    private Boolean isAlive;
    private Integer distance;

    public Creature(String name, Integer waterAmount) {
        this.name = name;
        this.waterAmount = waterAmount;
        this.isAlive = true;
        this.distance = 0;
    }

    public abstract void napos();
    public abstract void felhos();
    public abstract void esos();

    public boolean isWaterIncreasing(int number){
        return waterAmount + number <= maxWater;
    }

    public boolean isDead(){
        return waterAmount <=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(Integer waterAmount) {
        this.waterAmount = waterAmount;
    }

    public Integer getMaxWater() {
        return maxWater;
    }

    public void setMaxWater(Integer maxWater) {
        this.maxWater = maxWater;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
