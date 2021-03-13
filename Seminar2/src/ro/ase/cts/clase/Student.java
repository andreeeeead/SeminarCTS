package ro.ase.cts.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantata = 20;

	public Student() {
		super();

	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	
	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Elev: ");
		stringBuilder.append(super.toString())
				.append("Clasa=")
				.append(this.facultate)
				.append(", Tutore=")
				.append(this.anStudii);
		return stringBuilder.toString();
	}

	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.creareStringPentruSumaFinantata(this.sumaFinantata, "Studentul"));
	}
}
