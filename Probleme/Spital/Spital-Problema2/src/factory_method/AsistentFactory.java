package factory_method;

import models.Asistent;
import models.PersonalMedical;

public class AsistentFactory implements FactoryMethod{
    @Override
    public PersonalMedical createInstance(String nume) {
        return new Asistent(nume);
    }
}
