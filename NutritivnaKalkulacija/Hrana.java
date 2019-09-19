package energija;

public class Hrana extends Namirnica {
	private double tezina;
	private double belancevine;
	private double masti;
	private double ugljHidrati;

	public Hrana(String ime, double tezina, double belancevine, double masti, double ugljHidrati) {
		super(ime);
		this.tezina = tezina;
		this.belancevine = belancevine;
		this.masti = masti;
		this.ugljHidrati = ugljHidrati;
	}

	public double getBelancevine() {
		return belancevine = (belancevine / 100) * tezina;
	}

	public double getMasti() {
		return masti = (masti / 100) * tezina;
	}

	public double getUgljHidrati() {
		return ugljHidrati = (ugljHidrati / 100) * tezina;
	}

	public double getTezina() {
		return tezina;
	}

	public double energVr() {
		double energetVr = (((belancevine / 100) * tezina * 16.7) + ((masti / 100) * tezina * 37.6)
				+ ((ugljHidrati / 100) * tezina * 17.2));
		return energetVr;
	}

	public String toString() {
		String h = "";
		h += super.toString() + "(" + tezina + "g," + energVr() + "kJ)";
		return h;
	}

}
