package ro.ase.cts.memento.models;

public class MeciJucat {
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;
    private int numarBilete;
    private int numarSpectatori;
    private int numarJandarmi;

    public MeciJucat(String numeEchipaGazda, String numeEchipaOaspeti, int numarBilete, int numarSpectatori, int numarJandarmi) {
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
        this.numarBilete = numarBilete;
        this.numarSpectatori = numarSpectatori;
        this.numarJandarmi = numarJandarmi;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public void setNumeEchipaGazda(String numeEchipaGazda) {
        this.numeEchipaGazda = numeEchipaGazda;
    }

    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }

    public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    public int getNumarBilete() {
        return numarBilete;
    }

    public void setNumarBilete(int numarBilete) {
        this.numarBilete = numarBilete;
    }

    public int getNumarSpectatori() {
        return numarSpectatori;
    }

    public void setNumarSpectatori(int numarSpectatori) {
        this.numarSpectatori = numarSpectatori;
    }

    public int getNumarJandarmi() {
        return numarJandarmi;
    }

    public void setNumarJandarmi(int numarJandarmi) {
        this.numarJandarmi = numarJandarmi;
    }

    public Memento creareMemento() {
        Memento memento = new Memento(this.numeEchipaGazda, this.numeEchipaOaspeti, this.numarSpectatori);
        return memento;
    }

    public void setMemento(Memento memento) {
        this.numeEchipaGazda = memento.getNumeEchipaGazda();
        this.numeEchipaOaspeti = memento.getNumeEchipaOaspeti();
        this.numarSpectatori = memento.getNumarSpectatori();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MeciJucat{");
        sb.append("numeEchipaGazda='").append(numeEchipaGazda).append('\'');
        sb.append(", numeEchipaOaspeti='").append(numeEchipaOaspeti).append('\'');
        sb.append(", numarBilete=").append(numarBilete);
        sb.append(", numarSpectatori=").append(numarSpectatori);
        sb.append(", numarJandarmi=").append(numarJandarmi);
        sb.append('}');
        return sb.toString();
    }
}
