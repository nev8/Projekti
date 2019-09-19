package pozoristance;

public class Glumac extends Zaposleni {

	public Glumac(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);

	}

	public String imePosla() {
		String g = this.getClass().getSimpleName();
		return g;
	}

}
