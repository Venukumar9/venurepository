package postgress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class CurdOperation {

	 static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
		
			CurdOperation c = new CurdOperation();
			int choice;
			do {
				System.out.println("Press 1 To Insert the Record");
				System.out.println("Press 2 To Retrive  a particular Record ");
				System.out.println("Press 3 To Update The Record");
				System.out.println("Press 4 To Delete the Record");
				System.out.println("press 5 To Exit");
				choice =sc.nextInt();
				
				switch (choice) {
				case 1:
					    c.toinsertData();
					break;
				case 2:
					  c. toRetriveData();
					  break;
				case 3:
					   c.toUpdateData();
					   break;
				case 4:
					   c. todeleteData();
					   break;
				case 5:
					System.out.println("Exit");
					break;
					     
				default:
					break;
				}
				
				
			}
			while(choice!=5);
			System.out.println("enter the choice");

		}
		
		public static void todeleteData() throws ClassNotFoundException, SQLException {
			Connection connect = getConnect();
			String hotelname;
			System.out.println("enter hotel name to delete record");
			hotelname=sc.next();
			PreparedStatement ps = connect.prepareStatement("delete from hotel where hname=?");
			ps.setString(1, hotelname);
			int record =ps.executeUpdate();
			if(record>0) {
				System.out.println("record deleted");
			}
			else {
				System.out.println("record not found in database");
			}
		
			
			
		}

		public static void toUpdateData() throws ClassNotFoundException, SQLException {
			Hotel h = new Hotel();
			System.out.println("enter hotel location name");
			String Loc = sc.next();
			h.setLocations(Loc);
			System.out.println("enter hotelname");
			String hotelname =sc.next();
			h.setHotelname(hotelname);
			System.out.println("enter type");
			String htype=sc.next();
			h.setType(htype);
			System.out.println("enter business type");
			String btype=sc.next();
			h.setBusinessType(btype);
			System.out.println("enter services");
			String service =sc.next();
			h.setServices(service);
			System.out.println("enter cost per day");
			double cost = sc.nextDouble();
			h.setCostPerDay(55.55);
			Connection connect = getConnect();
			String q ="update hotel set hname=?,type=?,services=?,businessType=?,costperDay=? where locations=?";
			PreparedStatement ps =connect.prepareStatement(q);
			ps.setString(1, h.getHotelname());
			ps.setString(2, h.getType());
			ps.setString(3, h.getServices());
			ps.setString(4, h.getBusinessType());
			ps.setDouble(5, h.getCostPerDay());
			ps.setString(6, h.getLocations());
			int record =ps.executeUpdate();
			ps.close();
			connect.close();
			if(record>0) {
				System.out.println("updated");
			}
			else {
				System.out.println("record not found");
			}
			
			
		}

		public static void toRetriveData() throws ClassNotFoundException, SQLException {
			  Connection connect = getConnect();
			  PreparedStatement ps =connect.prepareStatement("select * from hotel");
			  ResultSet rs = ps.executeQuery();
			  while(rs.next()) {
				  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
			  }
			  ps.close();
			  connect.close();
			
		}

		public static void toinsertData() throws ClassNotFoundException, SQLException {
		 Hotel h = new Hotel();
		 System.out.println("enter your Hotel name");
		 String hotelname =sc.next();
		 
		 
		 System.out.println("enter your location");
		 String location = sc.next();
	
		 
		 System.out.println("enter your type");
		 String type = sc.next();
		 
		 System.out.println("enter business type ");
		 String Btype =sc.next();
	
		 
		 System.out.println("enter your services");
		 String service =sc.next();
		 h.setServices(service);
		 
		 System.out.println("enter cost per day");
		 double cost=sc.nextDouble();
		 h.setCostPerDay(cost);
		
		  Connection connect = getConnect();
		 PreparedStatement ps = connect.prepareStatement("insert into hotel (?,?,?,?,?,?)");
		 ps.setString(1, h.getHotelname());
		 ps.setString(2, h.getLocations());
		 ps.setString(3, h.getType());
		 ps.setString(4, h.getBusinessType());
		 ps.setString(5, h.getServices());
		 ps.setDouble(6, h.getCostPerDay());
		 int record =ps.executeUpdate();
		 ps.close();
		 connect.close();
		 if(record>0) {
			 System.out.println("inserted successfully......");
		 }
		 else {
			 System.out.println("invalid input");
		 }

		 
		}
		public static Connection getConnect() throws ClassNotFoundException, SQLException
		{
			String url ="jdbc:postgresql://localhost/motivity";
			String user="postgres";
			String pass="root";
			Connection connect = DriverManager.getConnection(url,user,pass);
			Class.forName( "com.mysql.cj.jdbc.Driver");
				return  DriverManager.getConnection(url,user,pass);
			
		}

	}



