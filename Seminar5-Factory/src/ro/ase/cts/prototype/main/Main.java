package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.models.Bilet;
import ro.ase.cts.prototype.models.Client;
import ro.ase.cts.prototype.models.Copiator;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Gigel", 30);
        Copiator client2 = client1.copiere();

        System.out.println(client1);
        System.out.println(client2);

        Bilet bilet1 = new Bilet(1, "echipa1", "echipa2", "20:00");
        Bilet bilet2 = (Bilet) bilet1.copiere();
        bilet2.setCod(2);
        Bilet bilet3 = (Bilet) bilet1.copiere();
        bilet3.setCod(3);

        System.out.println(bilet1);
        System.out.println(bilet2);
        System.out.println(bilet3);
    }
}
