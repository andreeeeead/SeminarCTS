package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.models.Client;
import ro.ase.cts.strategy.models.PlataCard;
import ro.ase.cts.strategy.models.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Gigel", new PlataCard());
        client.platesteNota(150);
        client.setModPlata(new PlataCash());
        client.platesteNota(20);
    }
}
