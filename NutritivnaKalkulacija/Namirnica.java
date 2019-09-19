package energija;

public abstract class Namirnica extends Energent {
	private String ime;
	private int id;
	public static int idGlobal = 1;

	public Namirnica(String ime) {
		this.ime = ime;
		id = idGlobal++;
	}

	public abstract double energVr();

	public String getIme() {
		return ime;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		String n = "";
		n += "[" + id + "] " + ime;
		return n;
	}

}
