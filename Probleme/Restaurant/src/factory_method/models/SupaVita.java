package factory_method.models;

public class SupaVita extends Supa{

    public SupaVita(String ingredientPrincipal) {
        super(ingredientPrincipal);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaVita{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
