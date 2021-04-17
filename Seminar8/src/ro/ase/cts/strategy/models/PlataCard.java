package ro.ase.cts.strategy.models;

public class PlataCard implements ModPlata{
    @Override
    public void realizarePlata(double suma) {
        System.out.println("S-a realizat plata cu cardul pentru suma de " + suma);
    }
}
