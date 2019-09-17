package agencija_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ponuda2 {
	private String konString = "jdbc:sqlite:C:\\Users\\Nevena\\Desktop\\itboot\\sql\\Domaci.db";
	private Connection connection;
	private int idTer;
	private String naziv;
	private String drzava;
	private int datumOd;
	private int datumDo;
	private int preostalaMesta;
	private int cena;

	public Ponuda2(int idTer, String naziv, String drzava, int datumOd, int datumDo, int preostalaMesta, int cena) {
		super();
		this.idTer = idTer;
		this.naziv = naziv;
		this.drzava = drzava;
		this.datumOd = datumOd;
		this.datumDo = datumDo;
		this.preostalaMesta = preostalaMesta;
		this.cena = cena;

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

	public boolean zakupii(int idTer) throws SQLException {
		this.connect();
		if (preostalaMesta > 0) {
			String upit = "update Termin set PreostaloMesta= PreostaloMesta-1 where idTer='" + idTer + "'";
			Statement stm = connection.createStatement();
			stm.execute(upit);
			stm.close();
			this.disconnect();
			return true;
		} else
			return false;
	}

	public boolean zakupi(String ime, String prezime, String tel) throws SQLException {
		this.connect();
		if (preostalaMesta > 0) {
			String upit = "insert into Osoba((Ime, Prezime, Kontakt) values('" + ime + "','" + prezime + "','" + tel
					+ "')";
			Statement stm = connection.createStatement();
			stm.execute(upit);
			stm.close();
			this.disconnect();
			return true;
		} else
			return false;
	}

	public boolean zakupi(int idOsobe) throws SQLException {
		this.connect();
		if (preostalaMesta > 0) {
			String upit = "update Termin set PreostaloMesta= PreostaloMesta-1 where idTer='" + idTer + "'";
			Statement stm = connection.createStatement();
			stm.execute(upit);
			
			stm.close();
			this.disconnect();
			return true;
		} else
			return false;
	}

	public String toString() {
		String p = "";
		p += "(" + idTer + ") " + naziv + "(" + drzava + ") " + datumOd + " - " + datumDo + " / " + cena + "eura : "
				+ preostalaMesta;
		return p;
	}

	public int getIdTer() {
		return idTer;
	}
}
