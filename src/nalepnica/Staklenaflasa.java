package nalepnica;

public class Staklenaflasa extends Flasa {
	

	public Staklenaflasa(String naziv, double cena, String vrstapica) {
		super(naziv, cena, vrstapica);
		
	}
	
	public double ukupnacena(Flasa f) {
		double c=0;
		{if (f.getZapremina()<0.5)
		c=f.getCena()+(f.getCena()*0.05);
		else if (f.getZapremina()>=0.5) {c=f.getCena()+(f.getCena()*0.1);}}
		return c;
		}
		

	public String toString() {
		String sta="";
		sta+=super.toString()+ "-staklena";
		return sta;

}
}