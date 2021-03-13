package ro.ase.cts.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{
    
    public StudentReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(super.file));
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Student student = new Student();
            super.citesteAplicant(scanner, student);
            int an_studii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            student.setAnStudii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        scanner.close();
        return studenti;
    }
}
