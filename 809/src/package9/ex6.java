package package9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex6 {

	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","12345678");
		String query="SELECT * FROM Item WHERE ID = 110";
		Statement stmt=conn.createStatement();
		
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println("ID:" + rs.getInt("id"));
			System.out.println("Description:" + rs.getString("describe"));

			System.out.println("Price:" + rs.getInt("price"));
			System.out.println("Quantity:" + rs.getInt("quantity"));

		}
		
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

}


/*
For which three objects must a vendor provide implementations in its JDBC driver?

A. Time
B. Date
C. Statement
D. ResultSet
E. Connection
F. SQLException
G. DriverManager


*/
