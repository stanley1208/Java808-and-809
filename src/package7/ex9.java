package package7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;

public class ex9 {

	public static void main(String[] args) throws IOException {
		Path source=Paths.get("C:/Users/user/Documents/abc/green.txt");
		Path target=Paths.get("C:/Users/user/Documents/abc/a/yellow.txt");
		
		Files.move(source, target,StandardCopyOption.ATOMIC_MOVE);
		Files.delete(source);

	}

}


