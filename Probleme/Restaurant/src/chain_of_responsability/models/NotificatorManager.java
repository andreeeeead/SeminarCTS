package chain_of_responsability.models;

public class NotificatorManager extends Notificator{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() == null && client.getNrTelefon() == null) {
            System.out.println(client.getNume() + " nu are datele salvate in baza de date");
        }
    }
}
