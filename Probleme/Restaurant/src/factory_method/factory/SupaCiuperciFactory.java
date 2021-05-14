package factory_method.factory;

import factory_method.models.Supa;
import factory_method.models.SupaCiuperci;

public class SupaCiuperciFactory implements Factory{
    @Override
    public Supa createInstance(String ingredientPrincipal) {
        return new SupaCiuperci(ingredientPrincipal);
    }
}
