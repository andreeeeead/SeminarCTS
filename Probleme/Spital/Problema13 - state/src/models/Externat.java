package models;

public class Externat implements State {
    @Override
    public void modificaStare(Pacient pacient) {
        if(!(pacient.getState() instanceof Externat) && pacient.getStare().equals("vindecat")) {
            System.out.println("Pacientul " + pacient.getNume() + " a fost externat");
            pacient.setState(this);
        }
        else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi externat");
        }
    }
}
