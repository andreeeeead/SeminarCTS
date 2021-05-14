package adapter.main;

import adapter.models.Adapter;
import adapter.models.BarAdapterClase;
import adapter.models.BarAdapterObiecte;
import adapter.models.Bucatarie;

public class AdapterMain {
    public static void main(String[] args) {
        Bucatarie bucatarie = new Bucatarie();
        bucatarie.printeazaFactura();

        Adapter adapterObiecte = new BarAdapterObiecte(bucatarie);
        adapterObiecte.printeazaFactura();

        Adapter adapterClase = new BarAdapterClase();
        adapterClase.printeazaFactura();
    }
}
