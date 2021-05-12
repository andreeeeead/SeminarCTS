package models;

public class OperatorInternare implements Internare{
    @Override
    public void realizareInternare(String numePacient, boolean areAsigurare) {
        System.out.println("Pacientul " + numePacient + " a fost internat si are asigurare: " + areAsigurare);
    }
}
