package Model;

public enum CreatureType {
    h {
        public Creature makeCreature(String name, Integer waterAmount) {
            return new Homokjaro(name, waterAmount);
        }
    },

    l {
        public Creature makeCreature(String name, Integer waterAmount) {
            return new Lepegeto(name, waterAmount);
        }
    },

    s {
        public Creature makeCreature(String name, Integer waterAmount) {
            return new Szivacs(name, waterAmount);
        }
    };

    public Creature makeCreature(String name, Integer waterAmount){
        return null;
    }
}
