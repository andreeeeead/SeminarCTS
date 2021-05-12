package models;

public class Rezultat implements IRezultat{
    private String numePacient;
    private String rezultat;

    public Rezultat(String numePacient, String rezultat) {
        this.numePacient = numePacient;
        this.rezultat = rezultat;
    }

    public String getNumePacient() {
        return numePacient;
    }

    @Override
    public void printeazaRezultate() {
        System.out.println("S-a printat rezultatul pentru pacientul " + numePacient);
    }
}
