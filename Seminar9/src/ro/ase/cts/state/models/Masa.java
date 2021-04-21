package ro.ase.cts.state.models;

public class Masa {
    private int cod;
    private State state;

    public Masa(int cod) {
        this.cod = cod;
        this.state = new StateLibera();
    }

    public void rezervaMasa() {
        if(this.state instanceof StateLibera) {
            this.state = new StateRezervata();
            System.out.println("Masa " + cod + " este rezervata");
        }
        else {
            System.out.println("Masa " + cod + " nu poate fi rezervata");
        }
    }

    public void ocupaMasa() {
        if(this.state instanceof StateRezervata) {
            this.state = new StateOcupata();
            System.out.println("Masa " + cod + " este ocupata");
        }
        else {
            System.out.println("Masa " + cod + " nu poate fi ocupata");
        }
    }

    public void ocupaMasaFaraRezervare() {
        if(this.state instanceof StateLibera) {
            this.state = new StateOcupata();
            System.out.println("Masa " + cod + " este ocupata");
        }
        else {
            System.out.println("Masa " + cod + " nu poate fi ocupata");
        }
    }

    public void elibereazaMasa() {
        if(!(this.state instanceof StateLibera)) {
            this.state = new StateLibera();
            System.out.println("Masa " + cod + " este eliberata");
        }
        else {
            System.out.println("Masa " + cod + " este deja libera");
        }
    }
}
