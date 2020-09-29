package controller;

import model.*;

import java.util.ArrayList;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht Vervoersmiddelen
 * <p>
 * Doel: uitprinten van de ingegeven vervoermiddelen
 */
public class VervoermiddelenLauncher {
    public static void main(String[] args) {

        ArrayList<Vervoermiddel> vervoermiddelen = new ArrayList<>();
        vervoermiddelen.add(new Koets("Glinkowski", "marathonwagen", 320, 2));
        vervoermiddelen.add(new Auto("Dacia", "Logan MPV", 1150, "benzine"));
        vervoermiddelen.add(new Fiets("Koga Mijata", "Colmaro Race Ultegra", 9));
        vervoermiddelen.add(new Zeilboot("Dufour", "36 Classic", 11.5));
        vervoermiddelen.add(new Motorboot("Broesder", "Kotter", 13.75, "diesel"));


        for (Vervoermiddel vervoermiddel : vervoermiddelen) {
            System.out.println(vervoermiddel);
        }
    }
}
