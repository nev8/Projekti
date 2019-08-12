package nalepnica;

public abstract class Flasa extends Nalepnica {
	private double cena;
	private double zapreminabezkaucije = 0.33;
	private double zapremina;
	private String vrstapica;
	

	public Flasa(String naziv, double cena, String vrstapica) {
		super(naziv);
		this.cena = cena;
		this.vrstapica = vrstapica;
		zapremina = zapreminabezkaucije;
	}

	public Flasa(String naziv, double cena, double zapremina, String vrstapica) {
		super(naziv);
		this.cena = cena;
		this.zapremina = zapremina;
		this.vrstapica = vrstapica;
	}

	public abstract double ukupnacena(Flasa f);

	public boolean vrsta() {
		if (vrstapica.equals("Bezlkoholno"))
			return true;
		else
			return false;
	}

	public double getCena() {
		return cena;
	}

	public double getZapremina() {
		return zapremina;
	}

	public String getVrstapica() {
		return vrstapica;
	}

	public void uvecajcenu(double u) {
		cena += u;

	}

	public void smanjicenu(double s) {
		cena -= s;
	}

	public String toString() {
		String f = "";
		f += super.toString() + "(" + cena + "," + zapremina + "," + vrstapica + ")";
		return f;
	}

}
