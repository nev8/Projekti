package planinarenje;

import java.util.Date;
import java.util.LinkedList;

public class Unoszbirka {
	private Planina planina;
	private Date datum;
	
	public Unoszbirka(Planina planina, Date datum) {
		this.planina=planina;
		this.datum=datum;
		// ako hocu da mi se datum kreira u trenutku kreiranja objekta onda nista u konstruktoru, a ovde
		//datum=new Data;
	}

	public Unoszbirka(Planina planina) {
		this.planina=planina;
		datum= new Date();
}

	public Planina getPlanina() {
		return planina;
	}

	public Date getDatum() {
		return datum;
	}  
	
}
