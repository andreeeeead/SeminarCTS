package ro.ase.cts.factorymethod.models;

public class FundasFactory implements Factory{
    @Override
    public Jucator getJucator(String nume) {
        return new Fundas(nume);
    }
}
