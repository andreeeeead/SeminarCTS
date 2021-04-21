package ro.ase.cts.state.models;

public class StateRezervata implements State{
    @Override
    public void descrieStare() {
        System.out.println("Ne aflam in starea rezervata");
    }
}
