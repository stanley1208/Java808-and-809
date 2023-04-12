package package5;



import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex10 {

	public static void main(String[] args) throws Exception{
		int i;
		char c;
		try (FileInputStream fis=new FileInputStream("C:/Users/88698/Desktop/course.txt");
				InputStreamReader isr=new InputStreamReader(fis);){
			while(isr.ready()) {
				isr.skip(2);
				i=isr.read();
				c=(char)i;
				System.out.print(c);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}






