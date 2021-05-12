package models;

public abstract class RezultatOnlineAbstract implements IRezultat{
    private Rezultat rezultat;

    public RezultatOnlineAbstract(Rezultat rezultat) {
        this.rezultat = rezultat;
    }

    public Rezultat getRezultat() {
        return rezultat;
    }

    @Override
    public void printeazaRezultate() {
        rezultat.printeazaRezultate();
    }

    public abstract void afiseazaRezultateOnline();
}
