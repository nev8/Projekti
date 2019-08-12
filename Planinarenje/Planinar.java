package planinarenje;

import java.util.LinkedList;

public abstract class Planinar {
	public static int IDglobal=1;
	public String ime;
	public int id;
	private Unoszbirka[] zbirka;
	private int brPopunjenih;
	public double zbirvisina=0;
	
	
	
	public Planinar(String ime, int kapacitet) {
		super();
		this.ime = ime;
		id=IDglobal;
		IDglobal++;
		zbirka=new Unoszbirka[kapacitet];
		brPopunjenih=0;
		
	}
	
	public void dodaj(Planina p) {
		if (brPopunjenih<zbirka.length) {
		zbirka[brPopunjenih++]=new Unoszbirka(p);}
		// ili brPopunjenih++; isti efekat
		
		}
	
	public double zbirvisina() {
		for(int i=0; i<brPopunjenih;i++) {
			zbirvisina+=zbirka[i].getPlanina().getVisina();
			if(zbirka[i].getPlanina().getVisina()>=1800)zbirvisina+=300;
	}
		return zbirvisina;
	}
	
	
	
	public abstract boolean penjiSe(Planina p);
	
	public int vratiId() {
		return id;
	}
	
	
	public boolean popniSe(Planina p) {
		if(penjiSe(p)==true) {
			dodaj(p);	
			return true;
		}
		else return false;
	}
	public String toString() {
		String s= ime + "-" + id;
		Planina[] planina= new Planina[brPopunjenih];
		for(int p=0; p<brPopunjenih; p++) {
			planina[p]= zbirka[p].getPlanina();
		}
		s+="\n" +Planina.ispisNiza(planina);
		return s;
	}
	
}


