package Pokemon;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name) {
        super(name, Pokemon.Type.FIRE);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
