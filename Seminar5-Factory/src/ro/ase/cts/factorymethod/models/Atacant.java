package ro.ase.cts.factorymethod.models;

public class Atacant extends Jucator{

    public Atacant(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
