package models;

public class Medic extends PersonalMedical {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
