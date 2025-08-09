package Pokemon;

public class Movement {
    private String name;
    private PokemonType type;
    private int PP;
    private int accuracy;
    private int damage;

    public Movement(String name, PokemonType type, int PP, int accuracy, int damage) {
        this.name = name;
        this.type = type;
        this.PP = PP;
        this.accuracy = accuracy;
        this.damage = damage;
    }

    // TODO: map string to value to make this easier
    public void printMove() {
        System.out.println("Name: " + this.name + " Type: " + this.type + " PP: " + this.PP + " Accuracy: " + this.accuracy + " Damage: " + this.damage);
    }
}
