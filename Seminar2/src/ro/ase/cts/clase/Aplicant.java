package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecte;

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public String[] getDenumiriProiecte() {
		return denumiriProiecte;
	}

	public void setDenumireProiect(String[] denumireProiect, int nrProiecte) {
		this.denumiriProiecte = denumireProiect;
		this.nrProiecte = nrProiecte;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("nume='").append(nume).append('\'');
		sb.append(", prenume='").append(prenume).append('\'');
		sb.append(", varsta=").append(varsta);
		sb.append(", punctaj=").append(punctaj);
		sb.append(", nr_proiecte=").append(nrProiecte);
		sb.append(", denumireProiect=").append(Arrays.toString(denumiriProiecte));
		return sb.toString();
	}

	public abstract void afisareSumaFinantata();

	public void afisareStatutProiect(Proiect proiect) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Aplicantul ")
				.append(this.nume)
				.append(" ")
				.append(this.prenume)
				.append(punctaj > proiect.getPragAcceptare() ? " a fost acceptat." : " nu a fost acceptat.");
		System.out.println(stringBuilder.toString());
	}

	public String creareStringPentruSumaFinantata(int suma, String tipAplicant) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(tipAplicant).append(" ");
		stringBuilder.append(this.getNume());
		stringBuilder.append(this.getPrenume());
		stringBuilder.append(" ");
		stringBuilder.append(" primeste ");
		stringBuilder.append(suma);
		stringBuilder.append(" Euro/zi in proiect.");
		return stringBuilder.toString();
	}
}
