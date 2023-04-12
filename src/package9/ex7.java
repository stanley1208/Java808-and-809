package package9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex7 {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/school";
		String userName="root";
		String passWord="12345678";
		Connection conn;
		try {
			conn=DriverManager.getConnection(dbURL,userName,passWord);
			Statement st=conn.createStatement();
			String query="DELETE FROM Student WHERE id=103";
			System.out.println("Status:"+st.execute(query));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



