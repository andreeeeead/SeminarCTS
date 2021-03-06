package ro.ase.cts.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

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
}
