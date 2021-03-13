package ro.ase.cts.clase;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static int sumaFinantata = 30;

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nrProiecte, String[] denumiriProiecte, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int getClasa() {
		return clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Elev: ");
		stringBuilder.append(super.toString())
				.append("Clasa=")
				.append(this.clasa)
				.append(", Tutore=")
				.append(this.tutore);
		return stringBuilder.toString();
	}

	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.creareStringPentruSumaFinantata(this.sumaFinantata, "Elevul"));
	}
}
