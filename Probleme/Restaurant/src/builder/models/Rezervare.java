package builder.models;

public class Rezervare {
    private String numeClient;
    private boolean asezareLaGeam;
    private boolean areScauneErgonomice;
    private boolean esteDecorataMasa;
    private boolean areMuzicaPersonalizata;
    private String genMuzica;

    public Rezervare(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public boolean isAsezareLaGeam() {
        return asezareLaGeam;
    }

    public void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    public boolean isAreScauneErgonomice() {
        return areScauneErgonomice;
    }

    public void setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
    }

    public boolean isEsteDecorataMasa() {
        return esteDecorataMasa;
    }

    public void setEsteDecorataMasa(boolean esteDecorataMasa) {
        this.esteDecorataMasa = esteDecorataMasa;
    }

    public boolean isAreMuzicaPersonalizata() {
        return areMuzicaPersonalizata;
    }

    public void setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
        this.areMuzicaPersonalizata = areMuzicaPersonalizata;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", asezareLaGeam=").append(asezareLaGeam);
        sb.append(", areScauneErgonomice=").append(areScauneErgonomice);
        sb.append(", esteDecorataMasa=").append(esteDecorataMasa);
        sb.append(", areMuzicaPersonalizata=").append(areMuzicaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
