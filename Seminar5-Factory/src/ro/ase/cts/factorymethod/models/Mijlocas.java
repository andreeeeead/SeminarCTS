package ro.ase.cts.factorymethod.models;

public class Mijlocas extends Jucator{
    public Mijlocas(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
