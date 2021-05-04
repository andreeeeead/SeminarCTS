package facade.models;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> paturiLibere;
    private List<Integer> paturiOcupate;

    public Salon(List<Integer> paturiLibere) {
        this.paturiLibere = paturiLibere;
        this.paturiOcupate = new ArrayList<>();
    }

    public List<Integer> getPaturiLibere() {
        return paturiLibere;
    }

    public List<Integer> getPaturiOcupate() {
        return paturiOcupate;
    }

    public void ocupaPat(int position) {
        if(this.paturiLibere != null) {
            this.paturiOcupate.add(this.paturiLibere.get(position));
            this.paturiLibere.remove(this.paturiLibere.get(position));
        }
    }

    public void elibereazaPat(int position) {
        this.paturiLibere.add(this.paturiOcupate.get(position));
        this.paturiOcupate.remove(this.paturiOcupate.get(position));
    }

    public boolean existaPaturiLibere() {
        if(paturiLibere != null) {
            return true;
        }
        return false;
    }
}
