package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.models.OperatorRezervari;
import ro.ase.cts.proxy.models.ProxyOperatorRezervari;

public class Main {
    public static void main(String[] args) {
        OperatorRezervari operatorRezervari = new OperatorRezervari();
        operatorRezervari.realizareRezervare("Gigel", 1);
        ProxyOperatorRezervari proxyOperatorRezervari = new ProxyOperatorRezervari(operatorRezervari, 4);
        proxyOperatorRezervari.realizareRezervare("Ionel", 1);
        proxyOperatorRezervari.realizareRezervare("Gigica", 5);
    }
}
