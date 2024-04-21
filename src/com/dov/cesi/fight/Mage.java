package com.dov.cesi.fight;

public class Mage extends Personnage {

    public Mage(String name, int lifePoints) {
        super(name, lifePoints);
    }

    @Override
    public int actionPoints() {
        return 150;
    }

    @Override
    public boolean canAttack() {
        return false;
    }

    @Override
    public boolean canHeal() {
        return true;
    }

    @Override
    public String getTypeName() {
        return "Je suis un mage";
    }
}
