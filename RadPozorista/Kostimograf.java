package rs.itbootcamp.gen4.nedelja4.pozoriste;

public class Kostimograf extends Zaposleni{

	public Kostimograf(String ime, Pozoriste pozoriste) {
		super(ime, pozoriste);
	}

	@Override
	public String imePosla() {
		return "Kostimograf";
	}

}
