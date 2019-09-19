package pozoristance;

import java.util.LinkedList;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private LinkedList<Zaposleni> zaposleni;
	// private Reditelj reditelj;//da li ovo moram da dodam da bi video,dobila
	// odgovor da ne mora!!! nauceno

	Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		// this.reditelj=reditelj;
		zaposleni = new LinkedList<Zaposleni>();
		zaposleni.add(reditelj);
	}

	public boolean dodaj(Glumac g) {
		zaposleni.add(g);
		return true;
	}

	public boolean dodaj(Kostimograf k) {
		int brojac = 0;
		for (int i = 0; i < zaposleni.size(); i++) {
			if (zaposleni.get(i).imePosla().equals("Kostimograf"))
				brojac++;
		}
		if (brojac == 0 || brojac == 1) {
			zaposleni.add(k);
			return true;
		} else
			return false;

	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	public String toString() {
		String p = " ";
		p += getNaziv() + ": ";
		for (int i = 0; i < zaposleni.size(); i++) {
			p += "\n\t" + zaposleni.get(i).toString();
		}
		return p;
	}
}