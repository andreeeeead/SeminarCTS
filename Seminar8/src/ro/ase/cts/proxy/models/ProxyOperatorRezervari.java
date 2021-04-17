package ro.ase.cts.proxy.models;

public class ProxyOperatorRezervari implements IOperatorRezervari{
    private OperatorRezervari operatorRezervari;
    private int nrMinPersoane;

    public ProxyOperatorRezervari(OperatorRezervari operatorRezervari, int nrMinPersoane) {
        this.operatorRezervari = operatorRezervari;
        this.nrMinPersoane = nrMinPersoane;
    }

    @Override
    public void realizareRezervare(String numeClient, int nrPersoane) {
        if(nrPersoane >= nrMinPersoane) {
            operatorRezervari.realizareRezervare(numeClient, nrPersoane);
        }
        else {
            System.out.println("Va rugam veniti fara rezervare");
        }
    }
}
