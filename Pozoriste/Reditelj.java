package pozoristance;

public class Reditelj extends Zaposleni {

	public Reditelj(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);

	}

	public String imePosla() {
		String r = this.getClass().getSimpleName();
		return r;
	}

}
