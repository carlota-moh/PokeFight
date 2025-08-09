import Pokemon.*;

public class Player {
    private String name;
    private Pokemon pokemon;

    public Player(String name) {
        this.setName(name);
    }

    public Player(String name, Pokemon pokemon) {
        this.setName(name);
        this.setPokemon(pokemon);
    }

    public static Player createrNamedPlayer(String name) {
        return new Player(name, new FirePokemon("TORCHIC"));
    }

    public static Player createDefaultPlayer() {
        return new Player("CPU", new WaterPokemon("MUDKIP"));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Pokemon getPokemon() {
        return this.pokemon;
    }

    public String getPokemonName() {
        return getPokemon().getName();
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
