package jdbc.connection.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExaample {

	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/motivity?autoReconnect=true&useSSL=false";
		String username="root";
		String password="root";
		String Query ="insert into hotel values('naabaad','xz','3t','d','d',22.22)";
		try {
			Connection connect = DriverManager.getConnection(url,username,password);
			Statement s =connect.createStatement();
			int x=s.executeUpdate(Query);
			if(x>0) {
				System.out.println("record inserted");
			}
			else {
				System.out.println("invalid input");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
