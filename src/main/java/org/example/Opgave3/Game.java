package org.example.Opgave3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Game {
    private final Deck deck = new Deck();
    private final Stack<Card> cardDeck = deck.createDeck();

    public Game() {}

    // Returns the top card of the deck.
    private Card drawCard() {
        Collections.shuffle(cardDeck);
        return cardDeck.getFirst();
    }

    // Compares the player's and NPCs card and returns the highest one.
    private Card highestCard(Card playerCard, Card npcCard) {
        Card highestCard;  // Empty card for holding winner.

        // Handles if card ranks are equal.
        if (playerCard.getRank() == npcCard.getRank()) {
            if (playerCard.getSuit() > npcCard.getSuit()) {
                System.out.println("Player wins!");
                highestCard = playerCard;
            } else {
                System.out.println("NPC wins!");
                highestCard = npcCard;
            }

            // Handles if playerCard is higher than npcCard.
        } else if (playerCard.getRank() > npcCard.getRank()) {
            System.out.println("Player wins!");
            highestCard = playerCard;

            // Handles if npcCard is higher than playerCard.
        } else {
            System.out.println("Player wins!");
            highestCard = npcCard;
        }
        return highestCard;
    }


    public void playCards() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The game is drawing a deck for you and one for the NPC. The higher card wins." +
                "\nType 'yes' if you wish to play or type 'no', if you wish to quit the game.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("yes")) {

                Card playerCard = drawCard();
                Card npcCard = drawCard();
                System.out.println("Player drew card " + playerCard + "." +
                        "\nNPC drew card " + npcCard + ".");

                highestCard(playerCard, npcCard);

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
