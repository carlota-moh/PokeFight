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
}
