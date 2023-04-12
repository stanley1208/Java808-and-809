package package5;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex7 {

	public static void main(String[] args) throws Exception{
		try(Folder f=new Folder()){
			f.open();
		}
	}

}

final class Folder implements AutoCloseable{
	
	public void open() {
		System.out.println("Open");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Close");
	}
}


