package ro.ase.cts.observer.models;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Clientul " + this.nume + " a primit mesajul " + mesaj);
    }
}
