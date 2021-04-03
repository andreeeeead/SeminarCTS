package ro.ase.cts.builder.program;

import ro.ase.cts.builder.models.Rezervare;
import ro.ase.cts.builder.models.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(1, false, false, false, true, "rock");
        Rezervare rezervare1 = new RezervareBuilder()
                .setCod(2)
                .setAreMancareInclusa(true)
                .setAreMuzicaAmbientala(true)
                .setGenMuzica("clasica")
                .build();
        Rezervare rezervare2 = new RezervareBuilder(3)
                .setAreScaunErgonomic(true)
                .build();
        System.out.println(rezervare);
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
