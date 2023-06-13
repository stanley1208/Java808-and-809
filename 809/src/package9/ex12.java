package package9;

import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ex12 {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://localhost:3306/school";
		String userName="root";
		String passWord="12345678";
		
		Connection conn=null;
		try {
			Properties prop=new Properties();
			   prop.put("user",userName);
			   prop.put("password",passWord);
			   conn=DriverManager.getConnection(dbURL,prop);
			if(conn!=null) {
				System.out.println("Connection Established!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

}
}



