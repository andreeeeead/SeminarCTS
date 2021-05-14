package models;

public class Pacient {
    private String nume;
    private String stare;
    private State state;

    public Pacient(String nume, String stare) {
        this.nume = nume;
        this.stare = stare;
        this.state = new Internat();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void internarePacient() {
        new Internat().modificaStare(this);
    }

    public void pacientSubObservatie() {
        new SubObservatie().modificaStare(this);
    }

    public void externarePacient() {
        new Externat().modificaStare(this);
    }
}
