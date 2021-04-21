package simple_factory;

import models.Asistent;
import models.Brancardier;
import models.Medic;
import models.PersonalMedical;

public class SimpleFactory {
    public PersonalMedical createInstance(TipPersonalMedical tipPersonalMedical, String nume) {
        switch (tipPersonalMedical) {
            case BRANCARDIER -> {
                return new Brancardier(nume);
            }
            case ASISTENT -> {
                return new Asistent(nume);
            }
            case MEDIC -> {
                return new Medic(nume);
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
