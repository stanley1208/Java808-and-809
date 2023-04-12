package package9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class ex1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","12345678");
		String query="SELECT id FROM student";
		try(Statement stmt=conn.createStatement()) {
			ResultSet rs=stmt.executeQuery(query);
//			stmt.executeQuery("SELECT id FROM student");
			while(rs.next()) {
				System.out.println("Employee ID:"+rs.getInt("id"));
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
