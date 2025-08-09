package Pokemon;

import java.util.HashSet;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name) {
        super(name, PokemonType.FIRE);
    }

    public HashSet<Movement> getInitialMoves() {
        HashSet<Movement> defaultMoves = new HashSet<>();
        defaultMoves.add(new Movement("SCRATCH", PokemonType.NORMAL, 30, 100, 30));
        defaultMoves.add(new Movement("CUT", PokemonType.NORMAL, 30, 100, 30));
        defaultMoves.add(new Movement("QUICK ATTACK", PokemonType.NORMAL, 35, 100, 30));
        defaultMoves.add(new Movement("EMBERS", PokemonType.FIRE, 30, 100, 40));
        return defaultMoves;
    }
}
