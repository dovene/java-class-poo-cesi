package com.dov.cesi.fight;


import com.dov.cesi.fight.utils.FileUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Game {

    public static void main(String[] args) {
        secondVersion();
    }

    public static void firstVersion(){
        Personnage soldat = new Soldat("Yoko", 500);
        Personnage roi = new Roi("Arthur", 300);
        Personnage mage = new Mage("Lucius", 200);
        ArrayList<Personnage> personnages = new ArrayList<>(Arrays.asList(soldat, roi, mage));
        int i = 0;
        while (!shouldGameEnd(personnages)) {
            for (Personnage personnage : personnages) {
                for (Personnage opponent : personnages) {
                    if (!personnage.getName().equals(opponent.getName()) && personnage.isAlive()) {
                        personnage.fight(opponent);
                    }
                }

            }
            i++;
        }
        System.out.println("--- Statistiques ---");
        for (Personnage personnage : personnages) {
            System.out.println(personnage.display());
        }
        System.out.println("--- Gagnant ---");
        System.out.println((personnages.stream().filter(Personnage::isAlive).collect(Collectors.toList()).get(0).display()));
        System.out.println("--- Le jeu s'est déroulé en " + i + " tours ------");

    }
    public static void secondVersion() {
        Personnage soldat = new Soldat("Yoko", 500);
        Personnage roi = new Roi("Arthur", 300);
        Personnage mage = new Mage("Lucius", 200);
        Personnage fee = new Fee("Marie", 250);
        Team teamUn = new Team(new ArrayList<>(Arrays.asList(roi, mage)));
        Team teamDeux = new Team(new ArrayList<>(Arrays.asList(soldat, fee)));
        int i = 0;
        while (teamUn.isAlive() && teamDeux.isAlive()) {
            teamUn.fight(teamDeux);
            teamDeux.fight(teamUn);
            i++;
        }
        System.out.println("--- Statistiques ---");
        System.out.println("--- Team A ---");
        teamUn.displayTeam();
        System.out.println("--- Team B ---");
        teamDeux.displayTeam();
        System.out.println("--- Equipe Gagnante ---");
        if (teamUn.isAlive()){
            teamUn.displayTeam();
        }else {
            teamDeux.displayTeam();
        }
        System.out.println("--- Le jeu s'est déroulé en " + i + " tours ------");

    }

    public static boolean shouldGameEnd(ArrayList<Personnage> personnages) {
        boolean res = false;
        long nbAlive = personnages.stream().filter(Personnage::isAlive).count();
        if (nbAlive == 0 || nbAlive == 1) {
            res = true;
        }
        return res;
    }
}
