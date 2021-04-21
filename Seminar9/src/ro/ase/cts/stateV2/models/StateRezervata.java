package ro.ase.cts.stateV2.models;

public class StateRezervata implements State{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getState() instanceof StateLibera) {
            System.out.println("Masa " + masa.getCod() + " a fost rezervata");
            masa.setState(this);
        }
        else {
            System.out.println("Masa " + masa.getCod() + " nu poate fi rezervata");
        }
    }
}
