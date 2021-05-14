package models;

public class InternareCommand implements ICommand{
    private Medic medic;
    private String numePacient;

    public InternareCommand(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void execute() {
        medic.internarePacient(numePacient);
    }
}
