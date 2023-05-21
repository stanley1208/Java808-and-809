package package7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;
import java.util.stream.Stream;

public class ex15 {

	public static void main(String[] args) throws IOException {
		Path source=Paths.get("C:/Users/user/Documents/java/december/log.txt");
		Path destination=Paths.get("C:\\Users\\user\\Documents\\java");
		Files.copy(source, destination);
	}

}

