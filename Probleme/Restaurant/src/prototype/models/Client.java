package prototype.models;

public class Client implements Prototype{
    private String nume;

    public Client() {
    }

    public Client(String nume) {
        this.nume = nume;
    }


    @Override
    public Client copiere() {
        Client client = new Client();
        client.nume = this.nume;
        return client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
