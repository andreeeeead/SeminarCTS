package models;

public class SubObservatie implements State{
    @Override
    public void modificaStare(Pacient pacient) {
        if(pacient.getState() instanceof Internat && pacient.getStare().equals("grava")) {
            System.out.println("Pacientul " + pacient.getNume() + " a fost pus sub observatie");
            pacient.setState(this);
        }
        else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi pus sub observatie");
        }
    }
}
