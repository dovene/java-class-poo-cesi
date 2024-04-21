package com.dov.cesi.fight;

import java.io.Serializable;

public class Roi extends Personnage  {

    public Roi(String name, int lifePoints) {
        super(name, lifePoints);
    }

    @Override
    public int actionPoints() {
        return 200;
    }

    @Override
    public boolean canAttack() {
        return true;
    }

    @Override
    public boolean canHeal() {
        return true;
    }

    @Override
    public String getTypeName() {
        return "Je suis un roi";
    }
}
