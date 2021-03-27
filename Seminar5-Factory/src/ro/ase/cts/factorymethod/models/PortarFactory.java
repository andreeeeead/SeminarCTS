package ro.ase.cts.factorymethod.models;

public class PortarFactory implements Factory{
    @Override
    public Jucator getJucator(String nume) {
        return new Portar(nume);
    }
}
