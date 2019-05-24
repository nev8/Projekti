package planinarenje;

import java.util.LinkedList;

public class TestPlaninarenje {

	public static void main(String[] args) {
		Planina p= new Planina("Mont Blan",4807);
		Planina p1=new Planina("Zlatibor",1496);
		Klasican a= new Klasican("Ivan",20);
		Alpinista b= new Alpinista("Ilija",20);
		Alpinista c= new Alpinista("Jovan",20);
		Klasican d= new Klasican("Marija",20);
		a.dodaj(p);
		b.dodaj(p1);
		
		
		LinkedList<Planinar> l= new LinkedList<Planinar>();
		l.add(a);
		l.add(b);
		
		
		Planinarskodrustvo pla= new Planinarskodrustvo("Pancicev vrh", 1980, l);
		pla.dodajClana(c);
		pla.dodajClana(d);
		
		

	}

}
