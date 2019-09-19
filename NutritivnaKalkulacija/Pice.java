package energija;

public class Pice extends Namirnica {
	private double kolicina;
	private double enVr;
	private double energeVr;

	public Pice(String ime, double kolicina, double enVr) {
		super(ime);
		this.kolicina = kolicina;
		this.enVr = enVr;
	}

	public double getKolicina() {
		return kolicina;
	}

	public double energVr() {
		energeVr = kolicina * enVr;
		return energeVr;
	}

	public String toString() {
		String p = "";
		p += super.toString() + "(" + kolicina + "l," + energVr() + "kJ)";
		return p;
	}

}
