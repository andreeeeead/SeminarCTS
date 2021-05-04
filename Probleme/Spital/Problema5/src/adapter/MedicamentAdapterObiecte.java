package adapter;

public class MedicamentAdapterObiecte implements MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public MedicamentAdapterObiecte(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
