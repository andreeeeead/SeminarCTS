package chain_of_responsability.models;

public abstract class Notificator {
    private Notificator nextNotificator;

    public Notificator getNextNotificator() {
        return nextNotificator;
    }

    public void setNextNotificator(Notificator nextNotificator) {
        this.nextNotificator = nextNotificator;
    }

    public abstract void notifica(Client client, String mesaj);
}
