package models;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Diviziune{
    private String denumire;
    private List<Diviziune> diviziuni;

    public Departament(String denumire) {
        this.denumire = denumire;
        this.diviziuni = new ArrayList<>();
    }

    @Override
    public void descriere() {
        System.out.println("Departament " + denumire);
        for (Diviziune diviziune:diviziuni) {
            diviziune.descriere();
        }
    }

    @Override
    public void adaugaDiviziune(Diviziune diviziune) {
        diviziuni.add(diviziune);
    }

    @Override
    public void stergeDiviziune(Diviziune diviziune) {
        diviziuni.remove(diviziune);
    }

    @Override
    public Diviziune getDiviune(int position) throws Exception {
        return diviziuni.get(position);
    }
}
