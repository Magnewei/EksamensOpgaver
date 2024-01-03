package org.example.Opgave3;


public class Card {
    private final int rank;
    private final int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String printRank = ranks[getRank()];
        String printSuit = suits[getSuit()];
        return printRank + " of " + printSuit + ".";
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }
}
