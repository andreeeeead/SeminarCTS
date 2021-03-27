package ro.ase.cts.factorymethod.models;

public class MijlocasFactory implements Factory{
    @Override
    public Jucator getJucator(String nume) {
        return new Mijlocas(nume);
    }
}
