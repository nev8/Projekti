package rs.itbootcamp.gen4.nedelja4.pozoriste;

public abstract class Zaposleni {
	String ime;
	Pozoriste pozoriste;
	
	public Zaposleni(String ime, Pozoriste pozoriste) {
		this.ime = ime;
		this.pozoriste = pozoriste;
	}
	
	public abstract String imePosla();
	public String getIme() {
		return ime;
	}
	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	public String toString() {
		return String.format("%s (%s, %s)", ime, imePosla(), pozoriste.getSkraceno());
	}
}
