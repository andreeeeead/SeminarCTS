package ro.ase.cts.singleton.lazy;

public class Caiet {
    private static Caiet instance;
    private int nrPagini;
    private String tipCaiet;
    private double grosimePagina;

    private Caiet(int nrPagini, String tipCaiet, double grosimePagina) {
        this.nrPagini = nrPagini;
        this.tipCaiet = tipCaiet;
        this.grosimePagina = grosimePagina;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public void setTipCaiet(String tipCaiet) {
        this.tipCaiet = tipCaiet;
    }

    public void setGrosimePagina(double grosimePagina) {
        this.grosimePagina = grosimePagina;
    }

    public static synchronized Caiet getInstance(int nrPagini, String tipCaiet, double grosimePagina) {
        if(instance == null) {
            instance = new Caiet(nrPagini, tipCaiet, grosimePagina);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Caiet{");
        sb.append("nrPagini=").append(nrPagini);
        sb.append(", tipCaiet='").append(tipCaiet).append('\'');
        sb.append(", grosimePagina=").append(grosimePagina);
        sb.append('}');
        return sb.toString();
    }
}
