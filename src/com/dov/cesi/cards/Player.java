package com.dov.cesi.cards;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> cards;
    private int point = 0;

    public Player(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String display(){
        return "points "+(point);
    }
}
