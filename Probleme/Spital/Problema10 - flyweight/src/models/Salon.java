package models;

public class Salon {
    private int nrSalon;
    private int nrPat;
    private int nrZile;

    public Salon(int nrSalon, int nrPat, int nrZile) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Salon{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZile=").append(nrZile);
        sb.append('}');
        return sb.toString();
    }
}
