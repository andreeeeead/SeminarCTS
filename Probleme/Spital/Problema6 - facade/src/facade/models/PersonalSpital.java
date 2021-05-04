package facade.models;

import java.util.List;

public class PersonalSpital {
    public static boolean verificareInternare(Pacient pacient, Salon salon) {
        if(pacient.prezintaStareGrava()) {
            if(Medic.confirmareInternare(pacient)) {
                if(salon.existaPaturiLibere()) {
                    return true;
                }
            }
        }
        return false;
    }
}
