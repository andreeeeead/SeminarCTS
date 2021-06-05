package ro.ase.cts.mocks;

import ro.ase.cts.clase.util.IStudent;

import java.util.List;

public class StudentFake implements IStudent {
    private String valoareGetNume;
    private List<Integer> valoareGetNote;
    private float valoareGetMedie;
    private int valoareGetNota;
    private boolean valoareAreRestante;

    @Override
    public String getNume() {
        return valoareGetNume;
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return valoareGetNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return valoareGetMedie;
    }

    @Override
    public int getNota(int index) {
        return valoareGetNota;
    }

    @Override
    public boolean areRestante() {
        return valoareAreRestante;
    }

    public void setValoareGetNume(String valoareGetNume) {
        this.valoareGetNume = valoareGetNume;
    }

    public void setValoareGetNote(List<Integer> valoareGetNote) {
        this.valoareGetNote = valoareGetNote;
    }

    public void setValoareGetMedie(float valoareGetMedie) {
        this.valoareGetMedie = valoareGetMedie;
    }

    public void setValoareGetNota(int valoareGetNota) {
        this.valoareGetNota = valoareGetNota;
    }

    public void setValoareAreRestante(boolean valoareAreRestante) {
        this.valoareAreRestante = valoareAreRestante;
    }
}
