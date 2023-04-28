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


public class ex31 {

	public static void main(String[] args) throws IOException {
		List<String> vaList=Arrays.asList("","George","John","Jim");
		Long newVal=vaList.stream()
							.filter(x->!x.isEmpty())
							.count();
		System.out.println(newVal);
	}
}






