package models;

public class PlataCard implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cu cardul pentru suma " + suma);
    }
}
