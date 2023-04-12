package package7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex1 {

	public static void main(String[] args) throws IOException {
		Path source=Paths.get("C:/Users/user/Documents/java/a.txt");
		Path destination=Paths.get("C:/Users/user/Documents/a");
		Files.copy(source, destination);
	}

}
