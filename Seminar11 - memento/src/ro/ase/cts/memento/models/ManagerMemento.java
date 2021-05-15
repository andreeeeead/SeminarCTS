package ro.ase.cts.memento.models;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
    private List<Memento> mementoList;

    public ManagerMemento() {
        this.mementoList = new ArrayList<>();
    }

    public void adaugaMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int position) {
        if(position >=0 && position < mementoList.size()) {
            return mementoList.get(position);
        }
        else throw new IndexOutOfBoundsException();
    }

    public Memento getLastMemento() {
        if(mementoList != null) {
            return mementoList.get(mementoList.size() - 1);
        }
        else throw new IndexOutOfBoundsException();
    }
}
