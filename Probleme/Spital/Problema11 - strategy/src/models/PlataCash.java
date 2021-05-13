package models;

public class PlataCash implements ModPlata{

    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cash pentru suma " + suma);
    }
}
