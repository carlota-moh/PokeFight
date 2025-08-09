package Pokemon;

import java.util.HashSet;

public class FirePokemon extends Pokemon {
    private static HashSet<Movement> defaultMoves = setDefaultMoves();
    private HashSet<Movement> pokemonMoves = new HashSet<>();

    public FirePokemon(String name) {
        super(name, PokemonType.FIRE);
        this.pokemonMoves = defaultMoves;
    }

    private static HashSet<Movement> setDefaultMoves() {
        HashSet<Movement> defaultMoves = new HashSet<>();
        defaultMoves.add(new Movement("SCRATCH", PokemonType.NORMAL, 30, 100, 30));
        defaultMoves.add(new Movement("CUT", PokemonType.NORMAL, 30, 100, 30));
        defaultMoves.add(new Movement("QUICK ATTACK", PokemonType.NORMAL, 35, 100, 30));
        defaultMoves.add(new Movement("EMBERS", PokemonType.FIRE, 30, 100, 40));
        return defaultMoves;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
