import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to PokeFight!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");

        // TODO: input validation
        String playerName = scanner.nextLine();
        System.out.printf("Welcome %s%n", playerName);

        Player player = Player.createrNamedPlayer(playerName);
        Player cpu = Player.createDefaultPlayer();
        System.out.println(player.getName() + " got assigned " + player.getPokemonName());
        System.out.println("CPU got assigned " + cpu.getPokemonName());

        // TODO: Randomize turns
        System.out.println("It's " + playerName + "turn");
        System.out.println("Select a move: ");
        player.getPokemon().printMoves();
    }
}