package main;

import models.IRezultat;
import models.Rezultat;
import models.RezultatOnline;
import models.RezultatOnlineAbstract;

public class Main {
    public static void main(String[] args) {
        IRezultat rezultat = new Rezultat("Gigel", "sanatos");
        rezultat.printeazaRezultate();

        RezultatOnlineAbstract rezultatOnline = new RezultatOnline(new Rezultat("Gigica", "bolnava"));
        rezultatOnline.printeazaRezultate();
        rezultatOnline.afiseazaRezultateOnline();
    }
}
