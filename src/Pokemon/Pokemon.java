package Pokemon;

public abstract class Pokemon {
    public enum Type {
        FIRE,
        WATER,
        GRASS
    }

    private String name;
    final Type type;
    private int hp;

    public Pokemon(String name, Type type) {
        this.name = name;
        this.type = type;
        this.hp = 100;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void reduceHp(int damagePoints) {
        this.hp = this.hp - damagePoints;
    }
}
