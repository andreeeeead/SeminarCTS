package adapter;

public class MedicamentAdapterClase extends MedicamentSpital implements MedicamentFarmacie{

    public MedicamentAdapterClase(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
