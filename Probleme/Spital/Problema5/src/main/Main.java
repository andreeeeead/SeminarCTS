package main;

import adapter.MedicamentAdapterClase;
import adapter.MedicamentAdapterObiecte;
import adapter.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        new MedicamentAdapterClase("Paracetamol", 25).cumparaMedicament();

        new MedicamentAdapterObiecte(new MedicamentSpital("Nurofen", 30)).cumparaMedicament();
    }
}
