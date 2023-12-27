package org.example.Opgave3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);


        System.out.println("The game is drawing a deck for you and one for the NPC. The higher card wins." +
                "\nType 'yes' if you wish to play or type 'no', if you wish to quit the game.");
        while(true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {

                Card playerCard = game.drawCard();
                Card npcCard = game.drawCard();
                System.out.println("Player drew card " + playerCard + "." +
                "\nNPC drew card " + npcCard + ".");

                game.highest(playerCard, npcCard);



            } else if (input.equalsIgnoreCase("no")) {
                System.out.println("Exiting game.");
                break;

            } else {
                System.out.println("Please type valid input.");
                input = scanner.nextLine();
            }


        }


    }

}
