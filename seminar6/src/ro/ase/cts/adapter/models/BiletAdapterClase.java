package ro.ase.cts.adapter.models;

public class BiletAdapterClase extends Bilet implements BiletOnline{

    public BiletAdapterClase(int pret) {
        super(pret);
    }

    @Override
    public void vindeBiletOnline() {
        super.vinde();
    }

    @Override
    public void rezervaBiletOnline() {
        super.rezerva();
    }
}
