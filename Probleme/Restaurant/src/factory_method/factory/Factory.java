package factory_method.factory;

import factory_method.models.Supa;

public interface Factory {
    Supa createInstance(String ingredientPrincipal);
}
