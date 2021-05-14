package factory_method.models;

public class SupaCiuperci extends Supa{

    public SupaCiuperci(String ingredientPrincipal) {
        super(ingredientPrincipal);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
