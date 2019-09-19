package rs.itbootcamp.gen4.nedelja4.pozoriste;

import java.util.ArrayList;
import java.util.List;

public class Predstava {
	private String naziv;
	private Pozoriste pozoriste;
	private List<Zaposleni> zaposleni;
	
	public Predstava(String naziv, Pozoriste pozoriste, Reditelj reditelj) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		this.zaposleni = new ArrayList<Zaposleni>();
		zaposleni.add(reditelj);
	}
		
	public boolean dodaj(Glumac glumac) {
		if(!(glumac.getPozoriste() == pozoriste))
			return false;
		zaposleni.add(glumac);
		return true;
	}
	public boolean dodaj(Kostimograf kostimograf) {
		if(!(kostimograf.getPozoriste() == pozoriste))
			return false;
		int broj = 0;
		for(int i=0;i<zaposleni.size();i++)
			if(zaposleni.get(i).imePosla().equals(kostimograf.imePosla()))
				broj++;
		if(broj>=2)
			return false;
		zaposleni.add(kostimograf);
		return true;
	}

	public String getNaziv() {
		return naziv;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}
	public String toString() {
		String buffer = naziv + ":";
		for(int i=0;i<zaposleni.size();i++) {
			buffer += "\n\t" + zaposleni.get(i).toString();
		}
		return buffer;
	}
}
