package ro.ase.cts.strategy.models;

public class PlataCash implements ModPlata {
    @Override
    public void realizarePlata(double suma) {
        System.out.println("S-a realizat plata cash pentru suma de " +  suma);
    }
}
