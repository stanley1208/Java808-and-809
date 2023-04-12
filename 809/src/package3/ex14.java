package package3;

import java.util.Optional;

public class ex14 {
	
	
	public static void main(String[] args) {
			Optional<String> city1=getCountry("Paris");
			Optional<String> city2=getCountry("Las Vegas");
			System.out.println(city1.orElse("Not found"));
			if(city2.isPresent()) {
				city2.ifPresent(x->System.out.println(x));
			}else {
				System.out.println(city2.orElse("Not found"));
			}
		}
	
	public static Optional<String> getCountry(String Ioc){
	
		Optional<String> couName=Optional.empty();
		if("Paris".equals(Ioc)) {
			couName=Optional.of("France");
		}else if("Mumbai".equals(Ioc)){
			couName=Optional.of("India");
		}
		return couName;
}
}







	






