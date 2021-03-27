package ro.ase.cts.singleton.eager;

public class ReceptieHotelEager {
    private static final ReceptieHotelEager instance = new ReceptieHotelEager("Gigel", 1, "UpperHouse");
    private String numeReceptioner;
    private int etaj;
    private String numeHotel;

    private ReceptieHotelEager(String numeReceptioner, int etaj, String numeHotel) {
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

    public static ReceptieHotelEager getInstance() {
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
