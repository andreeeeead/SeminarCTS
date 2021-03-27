package ro.ase.cts.factory.models;

public class Portar extends Jucator{

    public Portar(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
