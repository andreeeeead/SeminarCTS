package ro.ase.cts.stateV2.models;

public class StateOcupata implements State{
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getState() instanceof StateOcupata)) {
            System.out.println("Masa " + masa.getCod() + " a fost ocupata");
            masa.setState(this);
        }
        else {
            System.out.println("Masa " + masa.getCod() + " nu poate fi ocupata");
        }
    }
}
