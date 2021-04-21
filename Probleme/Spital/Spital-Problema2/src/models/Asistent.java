package models;

public class Asistent extends PersonalMedical {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
