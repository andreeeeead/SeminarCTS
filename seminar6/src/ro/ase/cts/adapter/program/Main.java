package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.models.Bilet;
import ro.ase.cts.adapter.models.BiletAdapter;
import ro.ase.cts.adapter.models.BiletOnline;

public class Main {
    public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
        bilet.rezerva();
        bilet.vinde();
    }

    public static void rezervaSiVindeBiletPePlatforma(BiletOnline biletOnline) {
        biletOnline.rezervaBiletOnline();
        biletOnline.vindeBiletOnline();
    }

    public static void main(String[] args) {
        Bilet bilet = new Bilet(20);
        rezervaSiVindeBiletLaCasa(bilet);
        BiletAdapter biletAdapter = new BiletAdapter(35);
        rezervaSiVindeBiletPePlatforma(biletAdapter);
    }
}
