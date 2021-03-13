package ro.ase.cts.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader{
    public AngajatReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(super.file));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.citesteAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        scanner.close();
        return angajati;
    }
}
