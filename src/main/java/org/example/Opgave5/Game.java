package org.example.Opgave5;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final int maxValue = 100;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private final int compareGuess = random.nextInt(1, maxValue+1);
    private int playerGuess, player2Guess;
    private Player humanPlayer1, secondPlayer;


    // Initializes game with a second player or NPC.
    public void play() {
        humanPlayer1 = new HumanPlayer(compareGuess, "Player 1", maxValue);
        System.out.println("Do you wish to play against a second player or the NPC?" +
                "\n[Yes] for NPC / [No] for a second human player.");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            secondPlayer = new ComputerPlayer(compareGuess,  "NPC", maxValue);
            playerGuess = humanPlayer1.makeAGuess();
            player2Guess = secondPlayer.makeAGuess();

        } else if (input.equalsIgnoreCase("no")) {
            secondPlayer = new HumanPlayer(compareGuess, "Player 2", maxValue);
            playerGuess = humanPlayer1.makeAGuess();
            player2Guess = secondPlayer.makeAGuess();

        } else {
            System.out.println("Please type a valid input.");
            play();
        }
        printWinner();
    }

    // Checks winner(s) and prints statements accordingly.
    private void printWinner() {
        System.out.println(humanPlayer1.getName() + " guess is: "  + playerGuess + ". \n" +
                secondPlayer.getName() + " guess is:  " + player2Guess + ". " +
                "\nThe random number is: " + compareGuess + ".");

        if (playerGuess == compareGuess) {
            System.out.println(humanPlayer1.getName() + " guessed correctly!");

        } else if(player2Guess == compareGuess) {
            System.out.println(secondPlayer.getName() + " guessed correctly!");

        } else {
            System.out.println("Nobody guessed correctly!");
        }
    }
}
