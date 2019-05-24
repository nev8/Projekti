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


	@Override //OZNACITI STA TI NIJE DOBRO U METODI
	public String toString() {
		String a="";
		a+=ime+"(" +visina+ ")";
		return a;
	}
	
	public static String ispisNiza(Planina[] planina) {//ne zovemo konkretno za planinu, nego hocemo da je koristimo kada pozovemo niz planina, kako se pozova metoda kada je static? kako izgleda sintaksa
		String s="";
		for(int i=0; i<planina.length; i++) {
			if(i>0) s+=", ";//stavi zarez ispred ako nije prva planina
			s+=planina[i];//dodajemo gornji toString za svaki element
		}
		return s;
	}
// static metoda radi samo sa onim sta joj je prosledjeno!!! nema smisla zvati je nad objektom, jer ona radi sa onim sto joj zadamo, a nestatic sa onim poljima koje smo zadali
}
