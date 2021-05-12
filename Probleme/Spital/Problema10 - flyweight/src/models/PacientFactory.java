package models;

import java.util.HashMap;

public class PacientFactory {
    private HashMap<String, Pacient> pacientHashMap;

    public PacientFactory() {
        this.pacientHashMap = new HashMap<>();
    }

    public void addPacient(Pacient pacient) {
        this.pacientHashMap.put(pacient.getNrTelefon(), pacient);
    }

    public Pacient getPacient(String nrTelefon) {
        return pacientHashMap.get(nrTelefon);
    }
}
