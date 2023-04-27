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


public class ex29 {

	public static void main(String[] args) throws IOException {
		List<String>li=Arrays.asList("Java","J2EE","J2ME","JSTL","JSP","Oracle DB");
		Predicate<String>val=p->p.contains("J");
		List<String>neLi=li.stream()
				.filter(x->x.length()>3)
				.filter(val)
				.collect(Collectors.toList());
		System.out.println(neLi);
	}
}






