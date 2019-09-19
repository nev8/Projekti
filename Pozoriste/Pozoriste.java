package pozoristance;

public class Pozoriste {
	private int id;
	private String naziv;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
	}

	public int getId() {
		return id;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getSkraceniNaziv() {
		String[] skracenica = naziv.split(" ");
		String s = "";
		for (int i = 0; i < skracenica.length; i++) {
			s += skracenica[i].charAt(0);
		}
		return s.toUpperCase();
	}

	public String toString() {
		String a = "";
		a += naziv + "[" + id + "]";
		return a;
	}

}
