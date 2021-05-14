package adapter.models;

public class BarAdapterObiecte implements Adapter{
    private Bucatarie bucatarie;

    public BarAdapterObiecte(Bucatarie bucatarie) {
        this.bucatarie = bucatarie;
    }

    @Override
    public void printeazaFactura() {
        bucatarie.printeazaFactura();
    }
}
