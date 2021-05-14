package main;

import models.InternareCommand;
import models.Medic;
import models.OperatorPrimire;
import models.TratareCommand;

public class Main {
    public static void main(String[] args) {
        OperatorPrimire operatorPrimire = new OperatorPrimire();
        Medic medic = new Medic("Gigel");

        operatorPrimire.adaugaComanda(new InternareCommand(medic, "Gigica"));
        operatorPrimire.adaugaComanda(new TratareCommand(medic, "Ionel"));
        operatorPrimire.adaugaComanda(new InternareCommand(medic, "Ioana"));
        operatorPrimire.adaugaComanda(new TratareCommand(medic, "Marian"));

        operatorPrimire.executaComanda();
        operatorPrimire.adaugaComanda(new InternareCommand(medic, "Maricica"));
        operatorPrimire.executaComenzi();
    }
}
