package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.models.Client;
import ro.ase.cts.flyweight.models.FlyweightFactory;
import ro.ase.cts.flyweight.models.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(1, 2, "12:00");
        Rezervare rezervare2 = new Rezervare(2, 2, "14:00");
        Rezervare rezervare3 = new Rezervare(3, 5, "12:00");

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Client client1 = flyweightFactory.getClient("0724589563");
        client1.printeazaRezervare(rezervare1);
        flyweightFactory.getClient("0724859632").printeazaRezervare(rezervare2);
        flyweightFactory.getClient("0724589563").printeazaRezervare(rezervare3);
    }
}
