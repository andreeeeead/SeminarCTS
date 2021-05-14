package builder.models;

public class RezervareBuilder implements Builder{
    private Rezervare rezervare;

    public RezervareBuilder(String numeClient) {
        this.rezervare = new Rezervare(numeClient);
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public RezervareBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.rezervare.setAreScauneErgonomice(areScauneErgonomice);
        return this;
    }

    public RezervareBuilder setEsteDecorataMasa(boolean esteDecorataMasa) {
        this.rezervare.setEsteDecorataMasa(esteDecorataMasa);
        return this;
    }

    public RezervareBuilder setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
        this.rezervare.setAreMuzicaPersonalizata(areMuzicaPersonalizata);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }
}
