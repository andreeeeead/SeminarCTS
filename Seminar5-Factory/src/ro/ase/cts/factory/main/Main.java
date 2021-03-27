package ro.ase.cts.factory.main;

import ro.ase.cts.factory.models.Factory;
import ro.ase.cts.factory.models.Jucator;
import ro.ase.cts.factory.models.TipJucator;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Jucator portar = factory.getJucator(TipJucator.Portar, "Gigel");
        Jucator fundas = factory.getJucator(TipJucator.Fundas, "Ionel");

        System.out.println(portar);
        System.out.println(fundas);
    }
}
