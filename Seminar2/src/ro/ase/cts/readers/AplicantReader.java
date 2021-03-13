package ro.ase.cts.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    protected String file;

    public AplicantReader(String file) {
        this.file = file;
    }

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void citesteAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nr = input.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumireProiect(vect, nr);
    }
}
