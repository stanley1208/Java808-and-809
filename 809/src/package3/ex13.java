package package3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ex13 {
	
	
	public static void main(String[] args) {
			Map<Integer,Integer>mVal=new HashMap<>();
			mVal.put(1, 10);
			mVal.put(2, 20);
			BiConsumer<Integer,Integer>c=(i,j)->{System.out.println(i+","+j);};
			c.accept(1, 2); // BiConsumer.accept
			mVal.forEach(c);
		}
}





	






