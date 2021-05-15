package ro.ase.cts.memento.main;

import ro.ase.cts.memento.models.ManagerMemento;
import ro.ase.cts.memento.models.MeciJucat;
import ro.ase.cts.memento.models.Memento;

public class Main {
    public static void main(String[] args) {
        MeciJucat meciJucat = new MeciJucat("Echipa1", "Echipa2", 250, 230, 100);
        Memento memento = meciJucat.creareMemento();
        ManagerMemento managerMemento = new ManagerMemento();
        managerMemento.adaugaMemento(memento);

        meciJucat.setNumarBilete(300);
        meciJucat.setNumarSpectatori(250);
        meciJucat.setNumeEchipaGazda("Echipa3");
        meciJucat.setNumeEchipaOaspeti("Echipa4");

        managerMemento.adaugaMemento(meciJucat.creareMemento());
        System.out.println(meciJucat);
        meciJucat.setMemento(managerMemento.getMemento(0));
        System.out.println(meciJucat);
    }

}
