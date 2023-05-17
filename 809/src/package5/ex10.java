package package5;



import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex10 {

	public static void main(String[] args){
	    int i;
	    char c;
	    try (FileInputStream fis = new FileInputStream("C:\\Users\\user\\Documents\\GitHub\\JavaSolutions\\809\\src\\package5\\employee.txt");
	            InputStreamReader isr = new InputStreamReader(fis);) {
	        while (isr.ready()) { //line n1
	            isr.skip(2);
	            i = isr.read();
	            c = (char) i;
	            System.out.print(c);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}






