public abstract class Entity {
    String name;
    int agility;
    int strength;
    int hp;
    int experience;
    int gold;

    public Entity(String name, int agility, int strength, int hp, int experience, int gold) {
        this.name = name;
        this.agility = agility;
        this.strength = strength;
        this.hp = hp;
        this.experience = experience;
        this.gold = gold;
    }

    public int attack() {
        if (agility * 3 > defenceRoll())
            return strength;
        else return 0;

    }


    //public int hitRoll = agility * 3;

    public int defenceRoll() {

      return   (int) (Math.random() * 100 );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
