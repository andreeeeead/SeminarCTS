package prototype.main;

import prototype.models.Client;

public class PrototypeMain {
    public static void main(String[] args) {
        Client client1 = new Client("Gigel");
        System.out.println(client1);
        Client client2 = client1.copiere();
        System.out.println(client2);
    }
}
