package models;

import java.util.ArrayList;
import java.util.List;

public class OperatorPrimire {
    private List<ICommand> commands;

    public OperatorPrimire() {
        commands = new ArrayList<>();
    }

    public void adaugaComanda(ICommand command) {
        commands.add(command);
    }

    public void executaComanda() {
        if(commands.size() > 0) {
            commands.get(0).execute();
            commands.remove(0);
        }
    }

    public void executaComenzi() {
        for (ICommand command: commands) {
            command.execute();
        }
        commands.clear();
    }
}
