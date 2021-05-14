package models;

public class Internat implements State {

    @Override
    public void modificaStare(Pacient pacient) {
        if(!(pacient.getState() instanceof Internat)) {
            System.out.println("Pacientul " + pacient.getNume() + " a fost internat");
            pacient.setState(this);
        }
        else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat");
        }
    }
}
