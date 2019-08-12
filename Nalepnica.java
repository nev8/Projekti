package nalepnica;

public class Nalepnica {
	private static int idGlobal = 1;
	private String naziv;
	private int id;

	public Nalepnica(String naziv) {
		super();
		this.naziv = naziv;
		id = idGlobal++;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		String n = "";
		n += naziv + ":" + id;
		return n;
	}

}
