package package9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex11 {

	public static void main(String[] args) throws SQLException {
		try {
			String dbURL="jdbc:mysql://localhost:3306/school";
			String userName="root";
			String passWord="12345678";
			
			Connection conn=DriverManager.getConnection(dbURL,userName,passWord);
			 Statement st=conn.createStatement();
			 ResultSet rs=st.executeQuery("SELECT * FROM student2");
			 rs.next();
			 System.out.println("Employee ID:"+rs.getInt("ID"));
		} catch (Exception e) {
			System.out.println("Error");
			
		}
		
		}

}




