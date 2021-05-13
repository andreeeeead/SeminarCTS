package main;

import models.Pacient;
import models.PlataCard;
import models.PlataCash;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gigel", new PlataCard());
        pacient.realizarePlata(500);
        pacient.setModPlata(new PlataCash());
        pacient.realizarePlata(250);
    }
}
