package ro.ase.cts.observer.models;

public interface Observabil {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteMesaj(String mesaj);
}
