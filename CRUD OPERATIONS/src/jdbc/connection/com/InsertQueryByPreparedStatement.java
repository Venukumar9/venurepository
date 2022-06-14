package jdbc.connection.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertQueryByPreparedStatement {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/motivity?autoReconnect=true&useSSL=false";
		String username="root";
		String password="root";
		String Query ="insert into hotel values(?,?,?,?,?,?)";
		Connection connect = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = connect.prepareStatement(Query);
		Scanner sc = new Scanner (System.in);
		System.out.println("enter hotel location");
	//	String Loc=sc.next();
		ps.setString(1, sc.next());
		System.out.println("enter hotelname");
		ps.setString(2, sc.next());
		System.out.println("enter type of hotel");
		ps.setString(3, sc.next());
		System.out.println("enter services");
		ps.setString(4, sc.next());
		System.out.println("enter businesstype");
		ps.setString(5, sc.next());
		System.out.println("enter cost per day");
		ps.setString(6, sc.next());
		int record =ps.executeUpdate();
		if(record>0) {
			System.out.println("inserted sucessfully");
		}
		else
		{
			System.out.println("invalid input");
		}

connect.close();
	}

}
