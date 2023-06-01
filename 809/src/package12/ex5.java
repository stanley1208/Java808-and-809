package package12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex5 {

	public static void main(String[] args) {
		IntStream st=IntStream.of(1,2,3);
		st.forEach(System.out::println);
//		st.forEach(System.out::println);
	}

}


/*
Which statement is true about java.util.stream.Stream?

A. A stream cannot be consumed more than once.
B. The execution mode of streams can be changed during processing.
C. Streams are intended to modify the source data.
D. A parallel stream is always faster than an equivalent sequential stream.




*/
