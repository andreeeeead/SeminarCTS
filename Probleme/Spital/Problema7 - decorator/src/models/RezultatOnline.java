package models;

public class RezultatOnline extends RezultatOnlineAbstract{

    public RezultatOnline(Rezultat rezultat) {
        super(rezultat);
    }

    public void afiseazaRezultateOnline() {
        System.out.println("S-au afisat rezultatele online pentru pacientul " + super.getRezultat().getNumePacient());
    }
}
