package factory_method.models;

public abstract class Supa {
    private String ingredientPrincipal;

    public Supa(String ingredientPrincipal) {
        this.ingredientPrincipal = ingredientPrincipal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("ingredientPrincipal='").append(ingredientPrincipal).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
