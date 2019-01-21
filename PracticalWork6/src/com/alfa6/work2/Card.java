package com.alfa6.work2;

public class Card {

    private Runk runk;
    private Suit suit;

    public Card(Suit suit, Runk runk) {
        this.runk = runk;
        this.suit = suit;
    }

    public Runk getRunk() {
        return runk;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " runk=" + runk +
                ", suit=" + suit;
    }
}
