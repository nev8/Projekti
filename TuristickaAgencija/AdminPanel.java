package agencija_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminPanel {
	private Connection connection;
	private String konString = "jdbc:sqlite:C:\\Users\\Nevena\\Desktop\\itboot\\sql\\Domaci.db";

	public AdminPanel() {

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

	public void modifikujCene(double procenat) throws SQLException {
		this.connect();
		String upit = "update Termin set Cena= Cena * ? ";
		PreparedStatement stm = connection.prepareStatement(upit);
		stm.setDouble(1, procenat);
		stm.execute();
		stm.close();
		this.disconnect();
	}

	public void ukloni(int idTer) throws SQLException {
		this.connect();
		String upit = "delete from Termin where idTer= '" + idTer + "'";
		Statement stm = connection.createStatement();
		stm.execute(upit);
		stm.close();
		this.disconnect();

	}

	public void stampajOsobe(int idTer) throws SQLException {
		this.connect();
		String upit = "select * from Putuje where idTer= '" + idTer + "'";
		// gornji upit je ako zelimo da izbacimo listu IdOsobe i IdTermina koji je
		// zakupila
		// ukoliko zelimo da izlistamo osobe koje su zakupile odgovarajuci termin
		// onda je sledeci upit:
		// String upit= "select o.Ime, o.Prezime, o.Kontakt from Osoba o,Putuje p,
		// Termin t WHERE o.IdOsobe=p.IdOsobe and p.IdTer=t.IdTer and t.IdTer='" +idTer+
		// "'";
		Statement stm = connection.createStatement();

		ResultSet rezultat = stm.executeQuery(upit);

		while (rezultat.next()) {
			int IdOsobe = rezultat.getInt(1);
			int IdTer = rezultat.getInt(2);

			System.out.println(IdOsobe + " " + IdTer);
		}
		stm.close();
		this.disconnect();

	}

}
