package chain_of_responsability.main;

import chain_of_responsability.models.*;

public class CORMain {
    public static void main(String[] args) {
        Notificator notificatorTelefon = new NotificatorTelefon();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManafer = new NotificatorManager();

        notificatorTelefon.setNextNotificator(notificatorEmail);
        notificatorEmail.setNextNotificator(notificatorManafer);

        Client client = new Client();
        client.setNume("Gigel");
        notificatorTelefon.notifica(client, "Avem reduceri");

        client.setEmail("gigel@gmail.com");
        notificatorTelefon.notifica(client, "Avem reduceri");
    }
}
