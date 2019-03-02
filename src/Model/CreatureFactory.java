package Model;

public class CreatureFactory {

    public static Creature createCreature(String name, Integer waterAmount,CreatureType creatureType) {
        return creatureType.makeCreature(name, waterAmount);
    }
}
