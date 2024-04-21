package com.dov.cesi.fight;

public class Soldat extends Personnage {

    public Soldat(String name, int lifePoints) {
        super(name, lifePoints);
    }

    @Override
    public int actionPoints() {
        return 100;
    }

    @Override
    public boolean canAttack() {
        return true;
    }

    @Override
    public boolean canHeal() {
        return false;
    }

    @Override
    public String getTypeName() {
        return "Je suis un soldat";
    }
}
