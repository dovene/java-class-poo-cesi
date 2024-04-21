package com.dov.cesi.fight;

public class Fee extends Personnage  {

    public Fee(String name, int lifePoints) {
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
        return true;
    }

    @Override
    public String getTypeName() {
        return "Je suis une fée";
    }
}
