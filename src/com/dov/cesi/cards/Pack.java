package com.dov.cesi.cards;

import java.util.ArrayList;

public class Pack {
    private ArrayList<Card> cards;

    public Pack(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
