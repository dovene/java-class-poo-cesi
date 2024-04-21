package com.dov.cesi.cards;

public class Card implements Comparable{


    public enum Colours {COEUR, CARREAU, TREFFLE, PIQUE}

    public enum Rank {
        DEUX(1), TROIS(2), QUATRE(3), CINQ(5), ROI(6), DAME(6), AS(7);
        private int level;
        Rank(int level){
           this.level = level;
        }
        public int getLevel(){
            return  this.level;
        }
    }

    private Colours couleur;
    private Rank rank;

    @Override
    public int compareTo(Object o) {
        return this.rank.getLevel() - ((Card)o).rank.getLevel();
    }

    public Colours getCouleur() {
        return couleur;
    }

    public void setCouleur(Colours couleur) {
        this.couleur = couleur;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Card(Colours couleur, Rank rank) {
        this.couleur = couleur;
        this.rank = rank;
    }

    public String display(){
        return "Card is : "+ this.couleur.name() + " rank "+ this.rank.name();
    }
}
