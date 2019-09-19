package pozoristance;

import java.util.LinkedList;

public class Repertoar {
	private Pozoriste pozoriste;
	private LinkedList<Predstava> predstave;

	public Repertoar(Pozoriste pozoriste) {
		this.pozoriste = pozoriste;
		predstave = new LinkedList<Predstava>();
	}

	public void dodaj(Predstava p) {
		predstave.add(p);

	}

	public void ukloni(Predstava p) {
		predstave.remove(p);
	}

	public String toString() {
		String r = "";
		r += pozoriste.getNaziv() + ": [\n";
		for (int i = 0; i < predstave.size(); i++) {
			r += predstave.get(i).toString();
		}
		r += "\n]";
		return r;
	}

}
