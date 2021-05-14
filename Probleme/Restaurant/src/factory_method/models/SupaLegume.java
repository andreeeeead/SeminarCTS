package factory_method.models;

public class SupaLegume extends Supa{

    public SupaLegume(String ingredientPrincipal) {
        super(ingredientPrincipal);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
