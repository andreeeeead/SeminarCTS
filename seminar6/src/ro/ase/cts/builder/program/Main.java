package ro.ase.cts.builder.program;

import ro.ase.cts.builder.models.Rezervare;
import ro.ase.cts.builder.models.RezervareBuilder;
import ro.ase.cts.builder.models.RezervareBuilderV2;

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

        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2();
        rezervareBuilderV2.setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
        Rezervare rezervare3 = rezervareBuilderV2.setCod(4).build();
        Rezervare rezervare4 = rezervareBuilderV2.setCod(5).build();

        System.out.println(rezervare3);
        System.out.println(rezervare4);
    }
}
