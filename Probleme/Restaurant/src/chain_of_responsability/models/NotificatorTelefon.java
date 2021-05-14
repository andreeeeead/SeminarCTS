package chain_of_responsability.models;

public class NotificatorTelefon extends Notificator{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon() != null) {
            System.out.println(client.getNume() + " ai primit un SMS cu mesajul " + mesaj);
        }
        else super.getNextNotificator().notifica(client, mesaj);
    }
}
