package models;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void realizarePlata(double suma) {
        this.modPlata.plateste(suma);
        System.out.println("Pacientul " + this.nume + " a platit suma de " + suma);
    }
}
