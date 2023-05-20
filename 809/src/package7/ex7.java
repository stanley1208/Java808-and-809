package package7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ex7 {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/user/Documents/resources/Messages.properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("welcome1"));
		System.out.println(prop.getProperty("welcome2", "Test"));//line n1
		System.out.println(prop.getProperty("welcome3"));
	}

}
