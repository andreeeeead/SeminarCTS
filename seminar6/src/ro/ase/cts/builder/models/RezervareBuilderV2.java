package ro.ase.cts.builder.models;

public class RezervareBuilderV2 implements AbstractBuilder{
    private int cod;
    private boolean areMancareInclusa;
    private boolean areBauturaInclusa;
    private boolean areScaunErgonomic;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public RezervareBuilderV2() {
        this.cod = 0;
        this.areBauturaInclusa = false;
        this.areMancareInclusa = false;
        this.areMuzicaAmbientala = false;
        this.areScaunErgonomic = false;
        this.genMuzica = null;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(cod, areMancareInclusa, areBauturaInclusa, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
    }

    public RezervareBuilderV2 setCod(int cod) {
        this.cod = cod;
        return this;
    }

    public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
        this.areBauturaInclusa = areBauturaInclusa;
        return this;
    }

    public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
