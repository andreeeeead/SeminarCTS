package main;

import models.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gigel", "buna");
        pacient.pacientSubObservatie();
        pacient.setStare("grava");
        pacient.pacientSubObservatie();
        pacient.externarePacient();
        pacient.setStare("vindecat");
        pacient.externarePacient();
        pacient.internarePacient();
    }
}
