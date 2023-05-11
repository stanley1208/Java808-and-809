package package3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ex16 {
	
	
	public static void main(String[] args) {
		List<Vehicles> vehicle=Arrays.asList(
				new Vehicles(2,"Car"),
				new Vehicles(3,"Bike"),
				new Vehicles(1,"Truck"));

		vehicle.stream()
//		.sorted((v1,v2)->Integer.compare(v1.getVid(),v2.getVid()))
		.sorted(Comparator.comparing((Vehicles v)->v.getVid()))
				.forEach(System.out::print);
		}
	
	

}

class Vehicles {
	int vId;
	String vName;
	public Vehicles(int vIdArg,String vNameArg) {
		this.vId=vIdArg;
		this.vName=vNameArg;	
	}
	
	public int getVid() {return vId;}
	public String getVName() { return vName;}
	public String toString() {
		return vName;	
	}

}




	






