package package4;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ex8 {

	public static void main(String[] args) {
		boolean res=new LengthValidator() {

			
			public boolean checkLength(String str) {
				// TODO Auto-generated method stub
				return str.length()>5 && str.length()<10;
			}
			
		}.checkLength("Hello");
		boolean res2=new Predicate() {

			
			public boolean test(Object str) {
				// TODO Auto-generated method stub
				return str.toString().length()>5 && str.toString().length()<10;
			}

			
			
		}.test("Hello");
	}

}

interface LengthValidator{
	public boolean checkLength(String str);
}

