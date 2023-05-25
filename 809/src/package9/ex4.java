package package9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex4 {

	public static void main(String[] args) throws SQLException {
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","12345678");
		Statement st=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);	
		st.execute("SELECT * FROM Employee");
		ResultSet rs=st.getResultSet();
		while(rs.next()) {
			if(rs.getInt(1)==112) {
				rs.updateString(2, "Stanley");
				rs.updateRow();
			}
		}
		rs.absolute(3);
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	
		} catch (Exception e) {
			System.out.println("Exception is raised");
		}
	}

}
