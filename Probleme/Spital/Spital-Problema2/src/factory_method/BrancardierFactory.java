package factory_method;

import models.Brancardier;
import models.PersonalMedical;

public class BrancardierFactory implements FactoryMethod{
    @Override
    public PersonalMedical createInstance(String nume) {
        return new Brancardier(nume);
    }
}
