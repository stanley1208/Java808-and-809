package package9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex10 {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://localhost:3306/school";
		String userName="root";
		String passWord="12345678";
		
		Connection conn=DriverManager.getConnection(dbURL,userName,passWord);
		 Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		 
		 st.execute("SELECT * FROM student2");
		 ResultSet rs=st.getResultSet();
		 rs.absolute(3);
//		 rs.moveToInsertRow();
		 rs.updateInt(1, 111);
		 rs.updateString(2, "555");
		 rs.updateRow();
		 rs.refreshRow();
		 System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
	}

}




