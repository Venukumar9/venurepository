package postgress;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionjdbc {

	public static void main(String[] args) throws SQLException {
		String url ="jdbc:postgresql://localhost/motivity";
		String user="postgres";
		String pass="root";
		Connection c = DriverManager.getConnection(url,user,pass);
	if(c!=null) {
		System.out.println("connection established");
	}
		

	}

}
