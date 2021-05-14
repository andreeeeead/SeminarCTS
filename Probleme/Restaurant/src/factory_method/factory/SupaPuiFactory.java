package factory_method.factory;

import factory_method.models.Supa;
import factory_method.models.SupaPui;

public class SupaPuiFactory implements Factory{
    @Override
    public Supa createInstance(String ingredientPrincipal) {
        return new SupaPui(ingredientPrincipal);
    }
}
