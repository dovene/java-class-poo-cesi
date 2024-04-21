package com.dov.cesi.fight;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Team {
    private ArrayList<Personnage> personnages;

    public ArrayList<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(ArrayList<Personnage> personnages) {
        this.personnages = personnages;
    }

    public Team(ArrayList<Personnage> personnages) {
        this.personnages = personnages;
    }

    public Personnage chooseFighter(){
        if (personnages.stream().filter(Personnage::isAlive).count()>=1){
             return personnages.stream().filter(Personnage::isAlive).collect(Collectors.toList()).get(0);
        } else
            return null;
    }

    public Personnage chooseTeamMember(Personnage personnageUn){
        if (personnages.stream().filter(personnage -> !personnage.getName().equals(personnageUn.getName())).count()>1){
            return personnages.stream().filter(personnage -> !personnage.getName().equals(personnageUn.getName())).collect(Collectors.toList()).get(0);
        } else
            return null;
    }

    public void fight(Team opponentTeam){
        Personnage fighterUn = chooseFighter();
        Personnage fighterDeux = opponentTeam.chooseFighter();
        //Logger.getLogger("CHOSEN FIGHTER").info(fighterDeux.getName());
        if (fighterUn!=null && fighterDeux!=null){
            if(fighterUn.canAttack()){
                fighterUn.attack(fighterDeux);
            }
            if(fighterUn.canHeal() && chooseTeamMember(fighterUn)!=null){
                fighterUn.heal(fighterUn);
            }
        }
    }

    public void displayTeam(){
        personnages.stream().forEach(personnage -> System.out.println(personnage.display()));

    }
    public boolean isAlive(){
       return getPersonnages().stream().filter(Personnage::isAlive).count() >= 1;
    }
}
