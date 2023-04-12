package package7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;
import java.util.stream.Stream;

public class ex14 {

	public static void main(String[] args) throws IOException {
		Stream<Path>stream=Files.list(Paths.get("/company"));
		stream.forEach(s->System.out.println(s));
		
	}

}

