package energija;

public class TestEnergija {

	public static void main(String[] args) {
		Meni meni = new Meni(10);

		meni.dodaj(new Hrana("Hleb", 600, 7.5, 0.4, 49));
		meni.dodaj(new Pice("Sok", 0.2, 18540));
		meni.dodaj(new Hrana("Sir", 200, 17, 1.2, 4));

		System.out.println(meni);

	}

}
