package models;

public class Anestezist extends PersonalMedical{
    public Anestezist(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Anestezist{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
