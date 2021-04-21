package ro.ase.cts.stateV2.models;

public class StateLibera implements State {

    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getState() instanceof StateLibera)) {
            System.out.println("Masa " + masa.getCod() + " este eliberata");
            masa.setState(this);
        }
        else {
            System.out.println("Masa " + masa.getCod() + " nu poate fi eliberata");
        }
    }
}
