package org.example.Opgave3;

import java.util.Collections;
import java.util.Stack;

public class Game {
    private final Deck deck = new Deck();
    Stack<Card> cardDeck = deck.createDeck();
    public Game() {

    }

    // Returns the top card of the deck.
    public Card drawCard() {
        Collections.shuffle(cardDeck);
        return cardDeck.getFirst();
    }

    // Compares the player's and NPC's card and returns the highest one.
    public Card highest(Card playerCard, Card npcCard) {
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

}
