package ro.ase.cts.flyweight.models;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String ora;

    public Rezervare(int nrMasa, int nrPersoane, String ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMasa=").append(nrMasa);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
