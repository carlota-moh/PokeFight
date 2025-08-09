package Pokemon;

import java.util.HashSet;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name) {
        super(name, PokemonType.WATER);
    }

    public HashSet<Movement> getInitialMoves() {
        HashSet<Movement> defaultMoves = new HashSet<>();
        defaultMoves.add(new Movement("TACKLE", PokemonType.NORMAL, 30, 100, 40));
        defaultMoves.add(new Movement("CUT", PokemonType.NORMAL, 30, 100, 30));
        defaultMoves.add(new Movement("QUICK ATTACK", PokemonType.NORMAL, 35, 100, 30));
        defaultMoves.add(new Movement("WATER GUN", PokemonType.FIRE, 20, 100, 40));
        return defaultMoves;
    }
}