package nalepnica;

public class Plasticnaflasa extends Flasa{
	

	public Plasticnaflasa(String naziv, double cena, String vrstapica) {
		super(naziv, cena, vrstapica);
		
	}
	
	public double ukupnacena(Flasa f) {
		double c;
		c=f.getCena();
		return c;
	}
	
	public String toString() {
		String pla="";
		pla+=super.toString()+ "-plasticna";
		return pla;
	}
	
	

}
