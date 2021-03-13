package ro.ase.cts.clase;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata = 10;

	public Angajat() {
		super();
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumirProiecte, int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumirProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	
	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Angajat: ");
		stringBuilder.append(super.toString())
				.append("Ocupatie=")
				.append(this.ocupatie)
				.append(", salariu=")
				.append(this.salariu);
		return stringBuilder.toString();
	}

	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.creareStringPentruSumaFinantata(this.sumaFinantata, "Angajatul"));
	}
}
