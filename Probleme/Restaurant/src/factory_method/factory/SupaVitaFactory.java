package factory_method.factory;

import factory_method.models.Supa;
import factory_method.models.SupaVita;

public class SupaVitaFactory implements Factory {
    @Override
    public Supa createInstance(String ingredientPrincipal) {
        return new SupaVita(ingredientPrincipal);
    }
}
