package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.models.Factory;
import ro.ase.cts.factorymethod.models.FundasFactory;
import ro.ase.cts.factorymethod.models.MijlocasFactory;
import ro.ase.cts.factorymethod.models.PortarFactory;

public class Main {
    private static void afisareJucator(Factory factory, String nume) {
        System.out.println(factory.getJucator(nume));
    }
    public static void main(String[] args) {
        afisareJucator(new PortarFactory(), "Gigel");
        afisareJucator(new FundasFactory(), "Ionel");
        afisareJucator(new MijlocasFactory(), "Marian");
    }
}
