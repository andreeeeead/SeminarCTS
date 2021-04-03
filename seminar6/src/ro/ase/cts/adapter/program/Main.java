package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.models.Bilet;
import ro.ase.cts.adapter.models.BiletAdapterClase;
import ro.ase.cts.adapter.models.BiletAdapterObiecte;
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

        BiletAdapterClase biletAdapter = new BiletAdapterClase(35);
        rezervaSiVindeBiletPePlatforma(biletAdapter);

        BiletOnline biletOnline = new BiletAdapterObiecte(bilet);
        rezervaSiVindeBiletPePlatforma(biletOnline);
    }
}
