package facade.models;

public class Medic {
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public static boolean confirmareInternare(Pacient pacient) {
        if(pacient.prezintaStareGrava()) {
            return true;
        }
        return false;
    }
}
