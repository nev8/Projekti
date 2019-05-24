package planinarenje;

import java.util.LinkedList;

public class Planinarskodrustvo {
	private String naziv;
	private int godina;
	private LinkedList<Planinar> listaplaninara;
	
	
	public Planinarskodrustvo(String naziv, int godina, LinkedList<Planinar> listaplaninara) {
		super();
		this.naziv = naziv;
		this.godina = godina;
		this.listaplaninara = listaplaninara;
	}
	
	public void dodajClana(Planinar p) {
		listaplaninara.add(p);
		
	}
	
	public Planinar dohvatiPlaninara(int a) {
		return listaplaninara.get(a);
	}
	
	public int brojPlaninara() {
		return listaplaninara.size();
	}
	
	

}
