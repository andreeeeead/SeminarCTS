package models;

public class Brancardier extends PersonalMedical {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
