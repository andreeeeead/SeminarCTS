package factory_method;

import models.PersonalMedical;

public interface FactoryMethod {
    PersonalMedical createInstance(String nume);
}
