package ro.ase.cts.state.main;

import ro.ase.cts.state.models.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.elibereazaMasa();
        masa.rezervaMasa();
        masa.rezervaMasa();
        masa.ocupaMasa();
        masa.elibereazaMasa();
    }
}
