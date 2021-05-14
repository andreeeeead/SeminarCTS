package models;

public interface Diviziune {
    void descriere();
    void adaugaDiviziune(Diviziune diviziune) throws Exception;
    void stergeDiviziune(Diviziune diviziune) throws Exception;
    Diviziune getDiviune(int position) throws Exception;
}
