package main;

import models.Pacient;
import models.PacientFactory;
import models.Salon;

public class Main {
    public static void main(String[] args) {
        Salon salon1 = new Salon(1, 10, 4);
        Salon salon2 = new Salon(5, 4, 10);
        Salon salon3 = new Salon(2, 7, 2);

        PacientFactory pacientFactory = new PacientFactory();
        Pacient pacient1 = new Pacient("Gigel", "0724589563", "Bucuresti");
        pacient1.realizareInternare(salon1);
        pacientFactory.addPacient(pacient1);
        pacientFactory.getPacient("0724589563").realizareInternare(salon3);
    }
}
