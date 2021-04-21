package factory_method;

import models.Anestezist;
import models.PersonalMedical;

public class AnestezistFactory implements FactoryMethod{
    @Override
    public PersonalMedical createInstance(String nume) {
        return new Anestezist(nume);
    }
}
