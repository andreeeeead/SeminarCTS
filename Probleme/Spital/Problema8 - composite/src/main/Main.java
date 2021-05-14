package main;

import models.Departament;
import models.Diviziune;
import models.Sectie;

public class Main {
    public static void main(String[] args) {
        Diviziune dep1 = new Departament("Cardiologie");
        Diviziune dep2 = new Departament("Chirurgie");

        Diviziune sectie1 = new Sectie("sectie1");
        Diviziune sectie2 = new Sectie("sectie2");
        Diviziune sectie3 = new Sectie("sectie3");

        try {
            dep1.adaugaDiviziune(sectie1);
            dep1.adaugaDiviziune(sectie2);
            dep2.adaugaDiviziune(sectie3);
            dep1.adaugaDiviziune(dep2);

            dep1.descriere();

            dep1.stergeDiviziune(sectie2);

            dep1.descriere();
            dep2.descriere();

            sectie1.adaugaDiviziune(sectie2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
