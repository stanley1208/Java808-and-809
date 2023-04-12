package package5;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class ex6 {

	static Connection newConnection=null;
	
	public static Connection getConnection() throws SQLException{
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1234")) {
			newConnection=con;
		}
		return newConnection;
	}
	
	public static void main(String[] args) throws SQLException{
		getConnection();
		System.out.println(newConnection); // com.mysql.cj.jdbc.ConnectionImpl@26794848
		Statement st=newConnection.createStatement(); // 產生後又斷線
		st.executeUpdate("INSERT INTO student VALUES (102,'kELVIN')");
	}

}


