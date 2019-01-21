package com.alfa6.work2;

public class Runner {

    public void run() {

        Card[] cards = new Card[52];

        int position = 0;

        for (Runk r : Runk.values()) {
            for (Suit s :
                    Suit.values()) {
                cards[position] = new Card(s, r);
                position++;
            }

        }

        for (Card c :
                cards) {
            System.out.println(c);
        }


    }
}
