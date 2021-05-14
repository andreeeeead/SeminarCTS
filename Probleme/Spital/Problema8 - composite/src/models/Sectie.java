package models;

public class Sectie implements Diviziune{
    private String denumire;

    public Sectie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void descriere() {
        System.out.println("Sectia " + denumire);
    }

    @Override
    public void adaugaDiviziune(Diviziune diviziune) throws Exception{
        throw new Exception("Sectia nu poate avea diviziuni");
    }

    @Override
    public void stergeDiviziune(Diviziune diviziune) throws Exception {
        throw new Exception("Sectia nu poate avea diviziuni");
    }

    @Override
    public Diviziune getDiviune(int position) throws Exception {
        throw new Exception("Sectia nu poate avea diviziuni");
    }
}
