package package12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex27 {

	public static void main(String[] args) throws IOException {
		Stream<String>lines=Files.lines(Paths.get("C:\\Users\\user\\Documents\\GitHub\\Java809-and-809\\Java809\\ocp\\customers.txt"));
		lines.forEach(c->System.out.print(c));
	}
}






