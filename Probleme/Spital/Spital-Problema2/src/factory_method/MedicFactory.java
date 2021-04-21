package factory_method;

import models.Medic;
import models.PersonalMedical;

public class MedicFactory implements FactoryMethod{
    @Override
    public PersonalMedical createInstance(String nume) {
        return new Medic(nume);
    }
}
