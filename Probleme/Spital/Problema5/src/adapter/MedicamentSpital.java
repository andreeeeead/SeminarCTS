package adapter;

public class MedicamentSpital {
    private String denumire;
    private double pret;

    public MedicamentSpital(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("S-a achizitionat medicamentul " + denumire + " la pretul de " + pret);
    }

    public void prezintaReteta() {
        System.out.println("S-a verificat reteta");
    }
}
