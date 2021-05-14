package models;

public class TratareCommand implements ICommand {
    private Medic medic;
    private String numePacient;

    public TratareCommand(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void execute() {
        medic.tratarePacient(numePacient);
    }
}
