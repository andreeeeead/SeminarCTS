package ro.ase.cts.template.models;

public class Masa extends TemplateOcupareMasa{
    public Masa(int cod) {
        super(cod);
    }

    @Override
    public void curataMasa() {
        System.out.println("Masa " + this.cod + " este curatata");
    }

    @Override
    public void aseazaServetele() {
        System.out.println("Pe masa " + this.cod + " s-au asezat servetele");
    }

    @Override
    public void aseazaTacamuri() {
        System.out.println("Pe masa " + this.cod + " s-au asezat tacamuri");
    }

    @Override
    public void invitaPersoane() {
        System.out.println("La masa " + this.cod + " au fost invitate persoanele");
    }
}
