package prototype;

import java.util.HashMap;

public class RetetaPrototype implements AbstractPrototype{
    private HashMap<String, Double> cantitati;

    public RetetaPrototype() {
        this.cantitati = new HashMap<>();
    }

    public void setCantitati(HashMap<String, Double> cantitati) {
        this.cantitati = cantitati;
    }

    public void insertCantitate(String ingredient, Double cantitate) {
        cantitati.put(ingredient, cantitate);
    }

    @Override
    public AbstractPrototype copiere() {
        RetetaPrototype retetaPrototype = new RetetaPrototype();
        HashMap<String, Double> temp = new HashMap<>();
        for (String ingredient: this.cantitati.keySet()) {
            temp.put(ingredient, this.cantitati.get(ingredient));
        }
        retetaPrototype.setCantitati(temp);
        return retetaPrototype;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaPrototype{");
        sb.append("cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }
}
