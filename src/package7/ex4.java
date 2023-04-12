package package7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class ex4 {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.home"));
		System.out.println(Paths.get(System.getProperty("user.home")));
		System.out.println(Files.walk(Paths.get(System.getProperty("user.home"))));
		Stream<Path>files=Files.walk(Paths.get(System.getProperty("user.home")));
		
//		files.forEach(fName->System.out.println(fName));
		
		files.forEach(fName->{
			try {
				Path aPath=fName.toAbsolutePath();
				System.out.println(fName+":"+Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());;
			} catch (Exception e) {
				e.getStackTrace();
			}
		});
	}

}
