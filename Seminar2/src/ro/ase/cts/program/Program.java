package ro.ase.cts.program;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	public static List<Aplicant> readAplicants(AplicantReader aplicantReader) throws FileNotFoundException {
		return aplicantReader.readAplicants();
	}

	public static void afisareAplicanti(List<Aplicant> aplicants) {
		Proiect proiect = new Proiect(81);
		for(Aplicant aplicant : aplicants) {
			System.out.println(aplicant.toString());
			aplicant.afisareSumaFinantata();
			aplicant.afisareStatutProiect(proiect);
		}
	}

	public static void main(String[] args) {
		try {
			List<Aplicant> aplicants = readAplicants(new AngajatReader("angajati.txt"));
			afisareAplicanti(aplicants);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
