package ro.ase.cts.proxy.models;

public class OperatorRezervari implements IOperatorRezervari {

    @Override
    public void realizareRezervare(String numeClient, int nrPersoane) {
        System.out.println("A fost realizata rezervarea pentru " + nrPersoane +" pe numele " + numeClient);
    }
}
