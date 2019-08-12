package turisticka_agencija;

import java.sql.SQLException;
import java.util.List;

public class TestProgram {

	private static void simulacijaImpl(Agencija agencija, String pocetnaPoruka, List<Ponuda> ponuda) {
		System.out.println("-- Osoba ulazi u turističku agenciju " + agencija.getNaziv() + " --");
		System.out.println("Osoba: Dobar dan! " + pocetnaPoruka + " Šta imate u ponudi?");
		if (ponuda.size() == 0) {
			System.err.println("Prodavac: Nažalost nemamo to u ponudi :(");
			System.out.println("Osoba: I vi ste mi neka agencija...!");
		} else {
			System.out.println("Prodavac: Ponuda za traženi upit je sledeća");
			for (int i = 0; i < ponuda.size(); i++)
				System.out.println(" " + ponuda.get(i));
			boolean zakupio = false;
			while (ponuda.size() > 0 && !zakupio) {
				System.out.println("Osoba: Zakupiću termin -- " + ponuda.get(0));
				try {
					zakupio = ponuda.get(0).zakupi();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (!zakupio) {
					System.err.println("Prodavac: Nažalost nemamo mesta u tom terminu :(");
					ponuda.remove(0);
				}
			}
			if (zakupio) {
				System.out.println("Prodavac: Zakupljeno!");
				System.out.println("Osoba: Hvala! Nadam se da će provod biti odličan!");
			} else {
				System.out.println("Osoba: I vi ste mi neka agencija...!");
			}
		}
		System.out.println();
	}

	public static void simulacija(Agencija agencija, String drzava) throws SQLException {
		simulacijaImpl(agencija, String.format("%s je moja odabrana zemlja zimovanja!", drzava),
				agencija.pretrazi(drzava));
	}

	public static void simulacija(Agencija agencija, int maxCena) throws SQLException {
		simulacijaImpl(agencija, String.format("Zanimaju me ponude do %d€.", maxCena), agencija.pretrazi(maxCena));
	}

	public static void main(String[] args) {
		try {
			Agencija agencija = new Agencija("ZimoTurs");
			simulacija(agencija, "Srbija");
			simulacija(agencija, 250);
			simulacija(agencija, "Svajcarska");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
