package com.dov.cesi.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Game {

    public static void main(String[] args){
        ArrayList<Card> cards = initPack();
        Collections.shuffle(cards);
        for (Card card: cards){
            System.out.println(card.display());
        }

        Player player1 = new Player(new ArrayList<Card>());
        Player player2 = new Player(new ArrayList<Card>());
        int totCards = cards.size();

        while (cards.size()>0 && ((player1.getCards().size() + player2.getCards().size())<=totCards)){
           int i = new Random().nextInt(cards.size());
            player1.getCards().add(cards.get(i));

            int j = new Random().nextInt(cards.size());
            player2.getCards().add(cards.get(j));

            if(cards.get(i).getRank().getLevel() > cards.get(j).getRank().getLevel() ){
                player1.setPoint(player1.getPoint()+2);
            } else if(cards.get(i).getRank().getLevel() == cards.get(j).getRank().getLevel()){
                player1.setPoint(player1.getPoint()+1);
                player2.setPoint(player2.getPoint()+1);
            } else {
                player2.setPoint(player2.getPoint()+2);
            }

            if (i<cards.size()){
                cards.remove(i);
            }
            if (j<cards.size()){
                cards.remove(j);
            }
        }

        System.out.println(player1.display()+" -- "+player1.getCards().size());
        System.out.println(player2.display()+" -- "+player2.getCards().size());

    }

    public static ArrayList<Card> initPack(){
        ArrayList<Card> cards = new ArrayList<>();
        for (Card.Colours colours: Card.Colours.values()){
            for (Card.Rank rank: Card.Rank.values()){
                cards.add(new Card(colours,rank));
            }
        }
        return cards;
    }
}
