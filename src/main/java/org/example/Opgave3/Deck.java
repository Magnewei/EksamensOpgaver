package org.example.Opgave3;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    private Card card;
    private Stack<Card> cards;

    // Empty constructor for instantiating object.
    public Deck() {}

   // Creates a deck of 52 cards.
   // Iterates over I and J until 52 is reached, then shuffles deck.
    public Stack<Card> createDeck() {
        Stack<Card> deck = new Stack<>();
        int ranks = 13;
        int suites = 4;

        for (int i = 0; i < ranks ; i++) {
            for(int j = 0; j < suites; j++) {
                deck.add(new Card(i, j));
            }
        }
        Collections.shuffle(deck);
        return deck;
    }

    // Adds a card at the top and then shuffles deck, to randomize the next card.
    public void addCard() {
        cards.push(card);
        Collections.shuffle(cards);
    }

    // Removes the card at the top of the deck.
    public void removeCard() {
        cards.pop();
    }


    // Returns the deck of cards.
    public Stack<Card> getDeck() {
        return cards;
    }


}
