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


public class ex33 {

	public static void main(String[] args) throws IOException {
		List<Integer>list1=Arrays.asList(10,20);
		List<Integer>list2=Arrays.asList(15,30);
		
		Stream.of(list1,list2)
        .flatMap(list->list.stream())
        .forEach(s->System.out.print(s+" "));
	}
}






