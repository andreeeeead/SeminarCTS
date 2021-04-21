package ro.ase.cts.stateV2.main;

import ro.ase.cts.stateV2.models.Masa;
import ro.ase.cts.stateV2.models.StateLibera;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(2);
        masa.ocupaMasa();
        masa.rezervaMasa();
//        masa.setState(new StateLibera());
//        masa.rezervaMasa();
        masa.elibereazaMasa();
    }
}
