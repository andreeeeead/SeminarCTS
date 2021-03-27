package ro.ase.cts.factorymethod.models;

public class AtacantFactory implements Factory{
    @Override
    public Jucator getJucator(String nume) {
        return new Atacant(nume);
    }
}
