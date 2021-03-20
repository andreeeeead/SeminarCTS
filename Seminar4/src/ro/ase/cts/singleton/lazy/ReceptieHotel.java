package ro.ase.cts.singleton.lazy;

public class ReceptieHotel {
    private static ReceptieHotel instance = null;
    private String numeReceptioner;
    private int etaj;
    private String numeHotel;

    private ReceptieHotel(String numeReceptioner, int etaj, String numeHotel) {
        this.numeReceptioner = numeReceptioner;
        this.etaj = etaj;
        this.numeHotel = numeHotel;
    }

    public void setNumeReceptioner(String numeReceptioner) {
        this.numeReceptioner = numeReceptioner;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public void setNumeHotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public static synchronized ReceptieHotel getInstance(String numeReceptioner, int etaj, String numeHotel) {
        if(instance == null) {
            instance = new ReceptieHotel(numeReceptioner, etaj, numeHotel);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReceptieHotel{");
        sb.append("numeReceptioner='").append(numeReceptioner).append('\'');
        sb.append(", etaj=").append(etaj);
        sb.append(", numeHotel='").append(numeHotel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
