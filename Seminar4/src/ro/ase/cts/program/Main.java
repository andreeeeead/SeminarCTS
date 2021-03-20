package ro.ase.cts.program;

import ro.ase.cts.singleton.eager.ReceptieHotel;

public class Main {
    public static void main(String[] args) {
        ReceptieHotel receptieHotel1 = ReceptieHotel.getInstance();
        ReceptieHotel receptieHotel2 = ReceptieHotel.getInstance();

        System.out.println(receptieHotel1);
        System.out.println(receptieHotel2);

        receptieHotel1.setEtaj(3);
        receptieHotel2.setNumeReceptioner("Gigica");

        System.out.println(receptieHotel1);
        System.out.println(receptieHotel2);

        ro.ase.cts.singleton.lazy.ReceptieHotel receptieHotel3 = ro.ase.cts.singleton.lazy.ReceptieHotel.getInstance("Ion", 2, "Hotel");
        ro.ase.cts.singleton.lazy.ReceptieHotel receptieHotel4 = ro.ase.cts.singleton.lazy.ReceptieHotel.getInstance("Marian", 4, "Hotel");

        System.out.println(receptieHotel3);
        System.out.println(receptieHotel4);
    }
}
