package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataHuesped {
	public Connection conectar() {
		Connection cx = null;
		try {
			cx = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "lokkitta", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cx;
	}
	
	
}
