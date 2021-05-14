package factory_method.simple_factory;

import factory_method.models.Supa;
import factory_method.models.SupaCiuperci;
import factory_method.models.SupaLegume;
import factory_method.models.SupaVita;

public class SimpleFactory {
    public Supa createInstance(TipSupa tipSupa, String ingredientPrincipal) {
        switch (tipSupa) {
            case SUPE_LEGUME -> {
                return new SupaLegume(ingredientPrincipal);
            }
            case SUPA_CIUPERCI -> {
                return new SupaCiuperci(ingredientPrincipal);
            }
            case SUPA_VITA -> {
                return new SupaVita(ingredientPrincipal);
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}
