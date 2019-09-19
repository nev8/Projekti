package rs.itbootcamp.gen4.nedelja4.pozoriste;

public class Pozoriste {
	private static int next_id = 1;
	private int id = next_id++;
	private String naziv;
	
	public Pozoriste(String naziv) {
		this.naziv = naziv;
	}
	public int getId() {
		return id;
	}
	public String getNaziv() {
		return naziv;
	}
	public String toString() {
		return String.format("%s [%d]", naziv,id);
	}
	public String getSkraceno() {
		String buffer = "";
		for(String rec: naziv.split(" ")) {
			buffer += rec.charAt(0);
		}
		return buffer.toUpperCase();
	}
}
