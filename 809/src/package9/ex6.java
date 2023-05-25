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
			String query = "Select * FROM Item WHERE ID = 110";
		    Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery(query);
		    while (rs.next()) {
		        System.out.println("ID:" + rs.getInt("Id"));
		        System.out.println("Description:" + rs.getString("Describe"));
		        System.out.println("Price:" + rs.getDouble("Price"));
		        System.out.println("Quantity:" + rs.getInt("Quantity"));
		    }
		} catch (SQLException se) {
		    System.out.println("Error");
		}
	}

}



