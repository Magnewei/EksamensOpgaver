package org.example.Opgave5;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final HumanPlayer humanPlayer1 = new HumanPlayer();
    private final int maxValue = 100;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private final int compareGuess = random.nextInt(1, (maxValue+1));
    private String playerName = "Player";
    private String player2Name = "NPC";
    private int playerGuess = 0;
    private int player2Guess = 0;


    public void play() {

        // Initializes game with NPC or Player.
        System.out.println("Do you wish to play against a second player or the NPC?" +
                "\n[Yes] for NPC / [No] for second player.");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            ComputerPlayer secondPlayer = new ComputerPlayer();

            System.out.println("Guess a number. The NPC will pick it's own.");
            playerGuess = humanPlayer1.makeAGuess(maxValue);
            player2Guess = secondPlayer.makeAGuess(maxValue);

        } else if (input.equalsIgnoreCase("no")) {
            HumanPlayer secondPlayer = new HumanPlayer();
            playerName = "Player 1";
            player2Name = "Player 2";

            System.out.println("Guess a number for " + playerName);
            playerGuess = humanPlayer1.makeAGuess(maxValue);

            System.out.println("Guess a number for " + player2Name);
            player2Guess = secondPlayer.makeAGuess(maxValue);

            // If input is invalid, recursion back to start of loop.
        } else {
            System.out.println("Please type a valid input.");
            play();
        }

        win();
    }


    // Checks if there's a winner and prints if true.
    private void win() {

        // Prints guesses.
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
