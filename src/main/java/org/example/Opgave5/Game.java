package org.example.Opgave5;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final Player humanPlayer1 = new HumanPlayer();
    private final int maxValue = 100;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private final int compareGuess = random.nextInt(1, (maxValue+1));
    private int playerGuess = 0;
    private int player2Guess = 0;
    private final String playerName = "Player 1";
    private String player2Name = "NPC";

    // Initializes game with a second player or NPC.
    public void play() {
        System.out.println("Do you wish to play against a second player or the NPC?" +
                "\n[Yes] for NPC / [No] for a second human player.");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            Player secondPlayer = new ComputerPlayer();

            System.out.println("Guess a number. The NPC will pick on its own.");
            playerGuess = humanPlayer1.makeAGuess(maxValue);
            player2Guess = secondPlayer.makeAGuess(maxValue);

        } else if (input.equalsIgnoreCase("no")) {
            Player secondPlayer = new HumanPlayer();
            player2Name = "Player 2";

            System.out.println("Guess a number for " + playerName);
            playerGuess = humanPlayer1.makeAGuess(maxValue);

            System.out.println("Guess a number for " + player2Name);
            player2Guess = secondPlayer.makeAGuess(maxValue);

        } else {
            System.out.println("Please type a valid input.");
            play();
        }
        printWinner(playerName, player2Name);
    }

    // Checks winner(s) and prints statements accordingly.
    private void printWinner(String playerName, String player2Name) {

        System.out.println(playerName + " guess is: "  + playerGuess + ". \n" +
                player2Name + " guess is:  " + player2Guess + ". " +
                "\nThe random number is: " + compareGuess + ".");

        if (playerGuess == compareGuess) {
            System.out.println(playerName + " guessed correctly!");

        } else if(player2Guess == compareGuess) {
            System.out.println(player2Name + " guessed correctly!");

        } else {
            System.out.println("Nobody guessed correctly!");
        }
    }
}
