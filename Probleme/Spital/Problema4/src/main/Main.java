package main;

import prototype.AbstractPrototype;
import prototype.RetetaPrototype;

public class Main {
    public static void main(String[] args) {
        RetetaPrototype retetaPrototype = new RetetaPrototype();
        retetaPrototype.insertCantitate("Calciu", 300.0);
        retetaPrototype.insertCantitate("Magneziu", 250.74);
        retetaPrototype.insertCantitate("Zinc", 0.15);
        AbstractPrototype reteta1 = retetaPrototype.copiere();

        System.out.println(retetaPrototype);
        System.out.println(reteta1);

        retetaPrototype.insertCantitate("Fier", 150.0);
        System.out.println(retetaPrototype);
        System.out.println(reteta1);
    }
}
