package com.alfa6.work2;

public class Runner {

    public void run() {

        Card[] cards = new Card[52];

        int position = 0;

        for (Suit suit : Suit.values()) {
            for (Runk runk : Runk.values()) {
                cards[position] = new Card(suit, runk);
                position++;
            }
        }

        for (Card c :
                cards) {
            System.out.println(c);
        }


    }
}
