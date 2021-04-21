package ro.ase.cts.observer.main;

import ro.ase.cts.observer.models.Client;
import ro.ase.cts.observer.models.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("restaurant", "Bucuresti");
        Client client1 = new Client("Ion");
        Client client2 = new Client("Ioana");
        Client client3 = new Client("Mihai");

        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);

        restaurant.realizareOfertaPret();

        restaurant.stergeObserver(client2);
        restaurant.adaugaObserver(client3);

        restaurant.introducereMeniu();
    }
}
