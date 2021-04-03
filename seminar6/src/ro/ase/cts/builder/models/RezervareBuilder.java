package ro.ase.cts.builder.models;

public class RezervareBuilder implements AbstractBuilder{
    private Rezervare rezervare;

    public RezervareBuilder(int cod) {
        this.rezervare = new Rezervare(cod, false, false, false, false, null);
    }

    public RezervareBuilder() {
        this.rezervare = new Rezervare(0, false, false, false, false, null);
    }

    public RezervareBuilder setCod(int cod) {
        this.rezervare.setCod(cod);
        return this;
    }

    public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
        this.rezervare.setAreMancareInclusa(areMancareInclusa);
        return this;
    }

    public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
        return this;
    }

    public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
        return this;
    }

    public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
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
