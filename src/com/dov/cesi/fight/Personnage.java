package com.dov.cesi.fight;

import java.io.Serializable;
import java.util.logging.Logger;

public abstract class Personnage implements Combat, Serializable {
    public abstract boolean canAttack();
    public abstract boolean canHeal();
    private String name;
    private int lifePoints;

    public Personnage(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public String getTypeName() {
        return "Je suis un personnage";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String display() {
        return getTypeName() + " et mon nom est " + name + ", j'ai un niveau de vie égale à " + lifePoints +" points";
    }

    public boolean isAlive() {
        return lifePoints > 0;
    }

    public Personnage fight(Personnage opponent) {
        if (canAttack()) {
            return attack(opponent);
        } else {
            return heal(opponent);
        }
    }

    public Personnage attack(Personnage opponent) {
        if(opponent.isAlive()){
            opponent.lifePoints -=  actionPoints();
        }
        //Logger.getLogger("Opponent attacked").info(opponent.getName());
        return opponent;
    }

    public Personnage heal(Personnage opponent) {
        if(opponent.isAlive()){
            opponent.lifePoints +=  actionPoints();
        }
        //Logger.getLogger("Opponent healed").info(opponent.getName());
        return opponent;
    }

    @Override
    public int actionPoints() {
        return 0;
    }

}
