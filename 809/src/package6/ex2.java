package package6;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ex2 {

	public static void main(String[] args) {
		Stream<Path>paths=Stream.of(Paths.get("C:/Users/Desktop/data.docx"),
				Paths.get("C:/Users/user/Desktop/data.txt"),
				Paths.get("C:/Users/Desktop/data.xml"));
		paths.filter(s->s.toString().endsWith("txt")).forEach(
				s->{
					try {
						Files.readAllLines(s)
						.stream()
						.forEach(System.out::println);
					}catch(Exception e) {
						System.out.println("Exception");
					}
				}
				);
	}

}
