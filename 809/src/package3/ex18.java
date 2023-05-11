package package3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ex18 {
	
	
	public static void main(String[] args) {
		List<Integer> codes=Arrays.asList(10,20);
		UnaryOperator<Integer> uo=s->s+10;
		codes.replaceAll(uo);
		codes.forEach(c->System.out.println(c));
		
}
	
	

}





	






