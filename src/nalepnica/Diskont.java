package nalepnica;

import java.util.LinkedList;

public class Diskont {
	private String naziv;
	private LinkedList<Flasa> asortiman;

	public Diskont(String naziv) {
		this.naziv = naziv;
		asortiman = new LinkedList<Flasa>();
	}

	public void dodajflasu(Flasa f) {
		asortiman.add(f);

	}

	public Flasa dohvatiflasu(int i) {
		return asortiman.get(i);

	}

	public double cenaasortimana() {
		double ukupno = 0;
		for (int i = 0; i < asortiman.size(); i++) {
			ukupno += asortiman.get(i).ukupnacena(asortiman.get(i));
		}
		return ukupno;
	}

	public String toString() {
		String dis = "";
		for (int i = 0; i < asortiman.size(); i++) {
			dis += asortiman.get(i) + "\n";
		}
		dis+="Ukupan iznos: " +cenaasortimana();
		return dis;
	}

}
