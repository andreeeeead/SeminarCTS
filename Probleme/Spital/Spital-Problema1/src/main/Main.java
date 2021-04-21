package main;

import builder.models.Pacient;
import builder.v1.PacientBuilderV1;
import builder.v2.PacientBuilderV2;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilderV1("Gigel").build();
        System.out.println(pacient1);
        Pacient pacient2 = new PacientBuilderV1("Ionel").setAreMicDejun(true).setArePapuci(true).build();
        System.out.println(pacient2);

        Pacient pacient3 = new PacientBuilderV2("Gigica").build();
        System.out.println(pacient3);
        Pacient pacient4 = new PacientBuilderV2("Ionica").setAreHalat(true).setArePatRabatabil(true).setArePapuci(true).build();
        System.out.println(pacient4);
    }
}
