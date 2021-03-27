package ro.ase.cts.prototype.models;

public class Client implements Copiator{
    private String nume;
    private int varsta;

    private Client() {
    }

    public Client(String nume, int varsta) {
        //se fac validari pentru nume si varsta
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public Copiator copiere() {
        Client client = new Client();
        client.nume = this.nume;
        client.varsta = this.varsta;
        return client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
