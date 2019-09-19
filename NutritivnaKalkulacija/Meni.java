package energija;

public class Meni {
	private Namirnica[] niz;
	private int brNam;
	private double energMeni;

	public Meni(int kapacitet) {
		super();
		niz = new Namirnica[kapacitet];
		brNam = 0;
	}

	public boolean dodaj(Namirnica n) {
		if (brNam < niz.length) {
			niz[brNam++] = n;
			return true;
		} else
			return false;
	}

	public double energVr() {
		double energMeni = 0;
		for (int i = 0; i < brNam; i++) {
			energMeni += niz[i].energVr();
		}
		return energMeni;
	}

	public String toString() {
		String m = "Meni ";
		m += "(" + energVr() + "kJ):";
		for (int i = 0; i < brNam; i++) {
			m += "\n" + niz[i];
		}
		return m;
	}

}
