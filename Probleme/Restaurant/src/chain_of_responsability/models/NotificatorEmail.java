package chain_of_responsability.models;

public class NotificatorEmail extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null) {
            System.out.println(client.getNume() + " ai primit un email cu mesajul " + mesaj);
        }
        else super.getNextNotificator().notifica(client, mesaj);
    }
}
