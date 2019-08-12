package nalepnica;

public class Testprogram {

	public static void main(String[] args) {
		Diskont d= new Diskont("Deni");
		Staklenaflasa f= new Staklenaflasa ("Coca-Cola", 50, "Bezalkoholno");
		Plasticnaflasa f1= new Plasticnaflasa ("Sprite", 80, "Bezalkoholno");
		Staklenaflasa f2= new Staklenaflasa("Gin",1700, "Alkoholno");
		d.dodajflasu(f);
		d.dodajflasu(f1);
		d.dodajflasu(f2);
		System.out.println(d);
		

	}

}
