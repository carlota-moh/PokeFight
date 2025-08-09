package Pokemon;

import java.util.HashSet;

public abstract class Pokemon {
    private String name;
    final PokemonType type;
    private int HP;
    private HashSet<Movement> pokemonMoves = new HashSet<>();

    public Pokemon(String name, PokemonType type) {
        this.name = name;
        this.type = type;
        this.HP = 100;
        this.pokemonMoves = getInitialMoves();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return this.HP;
    }

    public void reduceHP(int damagePoints) {
        this.HP = this.HP - damagePoints;
    }

    public abstract HashSet<Movement> getInitialMoves();

    public HashSet<Movement> getMoves() {
        return this.pokemonMoves;
    }

    public void printMoves() {
        this.pokemonMoves.forEach(move -> move.printMove());
    }

    public void setMovet(Movement newMove) {
        // TODO: A pokemon can only have 4 moves
        this.pokemonMoves.add(newMove);
    }
}
