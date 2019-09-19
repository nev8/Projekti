package pozoristance;

public class Kostimograf extends Zaposleni {

	public Kostimograf(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);

	}

	public String imePosla() {
		String k = this.getClass().getSimpleName();
		return k;
	}

}
