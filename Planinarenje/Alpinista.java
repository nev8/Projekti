package planinarenje;

public class Alpinista extends Planinar {
	private Alpinista alpinistadrug;
	private static final int V=3000;

	public Alpinista(String ime, int kapacitet) {
		super(ime, kapacitet);

	}

	public Alpinista(String ime, int kapacitet, Alpinista alpinistadrug) {
		super(ime, kapacitet);
		this.alpinistadrug = alpinistadrug;

	}
	public void dodeli(Alpinista a) {
		alpinistadrug=a;
	}

	public Alpinista getPlan() {
		return alpinistadrug;
	}

	public boolean penjiSe(Planina p) {
		if (p.getVisina() >= V || alpinistadrug != null)// ne mora preko getPlan(), moze samo alpinistadrug
			return true;
		else
			return false;
	}
	
	public String toString() {
		String a="";
		a+="A_";
		a+=super.toString();
		return a;
	}
}
