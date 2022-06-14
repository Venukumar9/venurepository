package jdbc.connection.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingStatement {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/motivity?autoReconnect=true&useSSL=false";
		String username="root";
		String password="root";
		Connection connect =DriverManager.getConnection(url,username,password);
		Statement s =connect.createStatement();
		int x=s.executeUpdate("delete from hotel where hname='oyoTown'");
		if(x>0) {
			System.out.println("delete record");
		}
		else {
			System.out.println("invalid input");
		}

	}

}
