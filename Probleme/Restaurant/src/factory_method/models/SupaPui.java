package factory_method.models;

public class SupaPui extends Supa{

    public SupaPui(String ingredientPrincipal) {
        super(ingredientPrincipal);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaPui{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
