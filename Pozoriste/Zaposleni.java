package pozoristance;

public abstract class Zaposleni {
	private String ime;
	private Pozoriste pozoriste;

	public abstract String imePosla();

	public Zaposleni(String ime, Pozoriste pozoriste) {
		this.ime = ime;
		this.pozoriste = pozoriste;
	}

	public String getIme() {
		return ime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String toString() {
		String b = "";
		b += ime + "(" + imePosla() + ", " + pozoriste.getSkraceniNaziv() + ")\n";
		return b;
	}

}
