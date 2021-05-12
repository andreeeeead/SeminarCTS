package models;

public class ProxyInternare implements Internare{
    private OperatorInternare operatorInternare;

    public ProxyInternare(OperatorInternare operatorInternare) {
        this.operatorInternare = operatorInternare;
    }

    @Override
    public void realizareInternare(String numePacient, boolean areAsigurare) {
        if(areAsigurare) {
            this.operatorInternare.realizareInternare(numePacient, areAsigurare);
        }
        else {
            System.out.println("Nu se poate realiza internarea pentru pacientul " + numePacient);
        }
    }
}
