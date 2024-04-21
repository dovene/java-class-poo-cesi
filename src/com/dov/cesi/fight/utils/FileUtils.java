package com.dov.cesi.fight.utils;


import com.dov.cesi.fight.Personnage;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {

    public static void writeToFile(ArrayList<Personnage> personnages){
        try {
            FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            // Write objects to file
            for (Personnage personnage: personnages){
                o.writeObject(personnage);
            }
            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public static ArrayList<Personnage> readFromFile(String path){
     ArrayList<Personnage> personnages = new ArrayList<>();
        try {
            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            // Read objects
            boolean isExist = true;

            while(isExist){
                if(fi.available() != 0){
                    personnages.add((Personnage) oi.readObject());
                }
                else{
                    isExist =false;
                }
            }
            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personnages;
    }
}
