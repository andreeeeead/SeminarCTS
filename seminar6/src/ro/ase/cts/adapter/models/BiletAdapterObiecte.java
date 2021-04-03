package ro.ase.cts.adapter.models;

public class BiletAdapterObiecte implements BiletOnline {
    private Bilet bilet;

    public BiletAdapterObiecte(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void vindeBiletOnline() {
        this.bilet.vinde();
    }

    @Override
    public void rezervaBiletOnline() {
        this.bilet.rezerva();
    }
}
