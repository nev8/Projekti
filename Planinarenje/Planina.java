package planinarenje;

public class Planina {
	private String ime;
	public double visina;
	
	public Planina(String ime, double visina) {
		this.ime=ime;
		this.visina=visina;
	}
	
	
	public String getIme() {
		return ime;
	}
	

	public double getVisina() {
		return visina;
	}


	@Override 
	public String toString() {
		String a="";
		a+=ime+"(" +visina+ ")";
		return a;
	}
	
	public static String ispisNiza(Planina[] planina) {
		String s="";
		for(int i=0; i<planina.length; i++) {
			if(i>0) s+=", ";
			s+=planina[i];
		}
		return s;
	}

