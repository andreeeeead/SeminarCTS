package facade.main;

import facade.models.Pacient;
import facade.models.PersonalSpital;
import facade.models.Salon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void realizareInernare(Pacient pacient, Salon salon) {
        if(PersonalSpital.verificareInternare(pacient, salon)) {
            System.out.println("S-a realizat internarea pentru " + pacient.toString());
        }
        else {
            System.out.println("Nu se poate realiza internarea pentru " + pacient.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> paturiLibere = new ArrayList<>();
        paturiLibere.add(1);
        paturiLibere.add(2);
        paturiLibere.add(3);
        paturiLibere.add(4);
        Salon salon = new Salon(paturiLibere);
        salon.ocupaPat(2);

        realizareInernare(new Pacient("Gigel", 22), salon);
        realizareInernare(new Pacient("Gigica", 60), salon);
    }

}
