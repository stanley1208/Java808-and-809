package package3;

import java.util.Set;
import java.util.TreeSet;

public class ex4 {
	public static void main(String[] args) {
		Set<Vehicle>vehicle=new TreeSet<>();
		vehicle.add(new Vehicle(10123,"Ford"));
		vehicle.add(new Vehicle(10124,"BMW"));
		System.out.println(vehicle);
	}
}


// 閬祕雿� Comparable
class Vehicle implements Comparable<Vehicle>{
	int vno;
	String name;
	
	public Vehicle(int vno,String name) {
		this.vno=vno;
		this.name=name;
	}
	
	public String toString() {
		return vno+":"+name;
	}
	
	@Override
	public int compareTo(Vehicle o) {
		
		return this.vno-o.vno;
	}
	
	
}

