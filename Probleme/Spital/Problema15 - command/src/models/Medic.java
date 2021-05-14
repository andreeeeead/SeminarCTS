package models;

public class Medic {
    private String numeMedic;

    public Medic(String numeMedic) {
        this.numeMedic = numeMedic;
    }

    public void internarePacient(String numePacient) {
        System.out.println("Medicul " + numeMedic + " a internat pacientul " + numePacient);
    }

    public void tratarePacient(String numePacient) {
        System.out.println("Medicul " + numeMedic + " a tratat pacientul " + numePacient);
    }
}
