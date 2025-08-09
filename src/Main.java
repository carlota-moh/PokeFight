import Pokemon.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Welcome to PokeFight!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");

        // TODO: input validation
        String playerName = scanner.nextLine();
        System.out.printf("Welcome %s%n", playerName);

        Player player = new Player(playerName);
        // TODO: Randomly pick from a list of pokemons
        FirePokemon pokemon = new FirePokemon("TORCHIC");
        System.out.printf(player.getName() + " got assigned " + pokemon.getName());

    }
}