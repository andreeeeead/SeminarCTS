package ro.ase.cts.stateV2.models;

public class Masa {
    private int cod;
    private State state;

    public Masa(int cod) {
        this.cod = cod;
        this.state = new StateLibera();
    }

    public State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void rezervaMasa() {
        new StateRezervata().modificaStare(this);
    }

    public void ocupaMasa() {
        new StateOcupata().modificaStare(this);
    }

    public void elibereazaMasa() {
        new StateLibera().modificaStare(this);
    }

    public void ridicaRezervare() {
        ocupaMasa();
    }
}
