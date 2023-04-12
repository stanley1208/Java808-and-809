package package7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;

public class ex11 {

	public static void main(String[] args) throws IOException {
		try {
			List<String>content=Files.readAllLines(Paths.get("C:\\Users\\user\\Documents\\java\\allemp.txt"));
		content.stream().forEach(line->{
			try {
				Files.write(
						Paths.get("employee.txt"),
						line.getBytes(),
						StandardOpenOption.APPEND
						);
			} catch (Exception e) {
				System.out.println("Exception 1");
			}
		});
		} catch (Exception e2) {
			System.out.println("Exception 2");
		}
		
		
	}

}


