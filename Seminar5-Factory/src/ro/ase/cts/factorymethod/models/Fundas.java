package ro.ase.cts.factorymethod.models;

public class Fundas extends Jucator{

    public Fundas(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
