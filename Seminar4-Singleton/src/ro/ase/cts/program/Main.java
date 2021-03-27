package ro.ase.cts.program;

import ro.ase.cts.singleton.eager.ReceptieHotelEager;
import ro.ase.cts.singleton.lazy.Caiet;
import ro.ase.cts.singleton.lazy.ReceptieHotelLazy;

public class Main {
    public static void main(String[] args) {
        ReceptieHotelEager receptieHotelEager1 = ReceptieHotelEager.getInstance();
        ReceptieHotelEager receptieHotelEager2 = ReceptieHotelEager.getInstance();

        System.out.println(receptieHotelEager1);
        System.out.println(receptieHotelEager2);

        receptieHotelEager1.setEtaj(3);
        receptieHotelEager2.setNumeReceptioner("Gigica");

        System.out.println(receptieHotelEager1);
        System.out.println(receptieHotelEager2);

        ReceptieHotelLazy receptieHotelLazy3 = ReceptieHotelLazy.getInstance("Ion", 2, "Hotel");
        ReceptieHotelLazy receptieHotelLazy4 = ReceptieHotelLazy.getInstance("Marian", 4, "Hotel");

        System.out.println(receptieHotelLazy3);
        System.out.println(receptieHotelLazy4);

        Caiet caiet1 = Caiet.getInstance(100, "patratele", 25.7);
        Caiet caiet2 = Caiet.getInstance(70, "dictando", 30);
        System.out.println(caiet1);
        System.out.println(caiet2);
    }
}
