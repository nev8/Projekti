package agencija_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class KorisnikPanel {
	private int IdKor;
	private String konString;
	private Connection connection;

	public KorisnikPanel() {
		this.konString = "jdbc:sqlite:C:\\Users\\Nevena\\Desktop\\itboot\\sql\\Domaci.db";
	}

	public void connect() throws SQLException {
		disconnect();
		connection = DriverManager.getConnection(konString);
	}

	public void disconnect() throws SQLException {
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
	}

	public LinkedList<Ponuda2> mojaPutovanja() throws SQLException {
		this.connect();
		String upit = "select t.IdTer, s.Naziv, s.Drzava, t.Od, t.Do, t.PreostaloMesta, t.Cena\r\n"
				+ "from Skijaliste s, Termin t, Korisnik k, Osoba o,Putuje p\r\n"
				+ "where k.IdOsobe=o.IdOsobe and s.IdSki=t.IdSki and p.IdTer=t.IdTer and p.IdOsobe='" + IdKor + "'";
		Statement stm = connection.createStatement();
		ResultSet rezultat = stm.executeQuery(upit);

		LinkedList ponuda = new LinkedList<Ponuda2>();
		while (rezultat.next()) {
			int IdTer = rezultat.getInt(1);
			String naziv = rezultat.getString(2);
			String drzava = rezultat.getString(3);
			int odlazak = rezultat.getInt(4);
			int dolazak = rezultat.getInt(5);
			int preostalomesta = rezultat.getInt(6);
			int cena = rezultat.getInt(7);
			ponuda.add(new Ponuda2(IdTer, naziv, drzava, odlazak, dolazak, preostalomesta, cena));

		}
		stm.close();
		this.disconnect();
		return ponuda;

	}

	public void ukloni(Ponuda2 p) throws SQLException {
		mojaPutovanja().remove(p);
		
	}
}
