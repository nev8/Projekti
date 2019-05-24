package planinarenje;

public class Klasican extends Planinar {
	private static final int V = 2000;

	public Klasican(String ime, int kapacitet) {
		super(ime, kapacitet);
	}

	public boolean penjiSe(Planina p) {
		if (p.getVisina() < V)
			return true;
		else
			return false;
	}

	public String toString() {
		String k = "";
		k += "K_";
		k += super.toString();// pozovamo klasu iz planinara
		return k;

	}

}
	
	


