package turisticka_agencija;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class Agencija {
	private String naziv;
	private Connection connection;
	private String konString;

	public Agencija(String naziv) {
		this.naziv = naziv;
		this.konString = "jdbc:sqlite:C:\\Users\\Nevena\\Desktop\\Agencija1.db";
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

	public LinkedList<Ponuda> pretrazi(int maxCena) throws SQLException {
		this.connect();
		String upit = "select t.IdTer, s.Naziv, s.Drzava, t.Od, t.Do, t.PreostaloMesta, t.Cena "
				+ " from Skijaliste s, Termin t" + " where s.IdSki=t.IdSki and t.Cena<" + maxCena
				+ " order by t.Cena asc";
		Statement stm = connection.createStatement();
		ResultSet rezultat = stm.executeQuery(upit);

		LinkedList ponuda = new LinkedList<Ponuda>();
		while (rezultat.next()) {
			int IdTer = rezultat.getInt(1);
			String naziv = rezultat.getString(2);
			String drzavaa = rezultat.getString(3);
			int odlazak = rezultat.getInt(4);
			int dolazak = rezultat.getInt(5);
			int preostalomesta = rezultat.getInt(6);
			int cena = rezultat.getInt(7);
			ponuda.add(new Ponuda(IdTer, naziv, drzavaa, odlazak, dolazak, preostalomesta, cena));

		}
		stm.close();
		this.disconnect();
		return ponuda;

	}

	public LinkedList<Ponuda> pretrazi(String drzava) throws SQLException {
		this.connect();
		String upit = "select t.IdTer, s.Naziv, s.Drzava, t.Od, t.Do, t.PreostaloMesta, t.Cena from Skijaliste s, Termin t where s.IdSki=t.IdSki and s.Drzava= '"
				+ drzava + "'";
		Statement stm = connection.createStatement();
		ResultSet rezultat = stm.executeQuery(upit);

		LinkedList ponuda = new LinkedList<Ponuda>();
		while (rezultat.next()) {
			int IdTer = rezultat.getInt(1);
			String naziv = rezultat.getString(2);
			String drzavaa = rezultat.getString(3);
			int odlazak = rezultat.getInt(4);
			int dolazak = rezultat.getInt(5);
			int preostalomesta = rezultat.getInt(6);
			int cena = rezultat.getInt(7);
			ponuda.add(new Ponuda(IdTer, naziv, drzavaa, odlazak, dolazak, preostalomesta, cena));

		}
		stm.close();
		this.disconnect();
		return ponuda;
	}

	public String getNaziv() {
		return naziv;
	}

}
