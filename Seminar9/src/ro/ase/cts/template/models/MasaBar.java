package ro.ase.cts.template.models;

public class MasaBar extends Masa{

    public MasaBar(int cod) {
        super(cod);
    }

    @Override
    public void aseazaTacamuri() {
        System.out.println("Pe masa " + this.cod + " s-au asezat pahare");
    }
}
