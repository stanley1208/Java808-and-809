package package12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ex28 {

	public static void main(String[] args) throws IOException {
		List<String> qwords=Arrays.asList("why ", "what ", "when ");
		BinaryOperator<String> operator=(s1,s2)->s1.concat(s2);// line n1
		String sen=qwords.stream()
			.reduce("Word: ",operator);
		System.out.println(sen);
	}
}






