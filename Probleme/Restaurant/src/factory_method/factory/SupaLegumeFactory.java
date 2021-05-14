package factory_method.factory;

import factory_method.models.Supa;
import factory_method.models.SupaLegume;

public class SupaLegumeFactory implements Factory{
    @Override
    public Supa createInstance(String ingredientPrincipal) {
        return new SupaLegume(ingredientPrincipal);
    }
}
