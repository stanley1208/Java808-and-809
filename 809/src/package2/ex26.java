package package2;

import java.util.ArrayList;
import java.util.List;

public class ex26 {
	
	public static void main(String[] args) {
		Course[] c=Course.values();
		System.out.println(c[1].getCost());
		for(Course a:Course.values()) {
			System.out.println(a+" Fees "+a.getCost()+" ");			
		}
	}
}

enum Course{
	JAVA(100),
	J2ME(150);
	
	private int cost;
	Course(int c){
		this.cost=c;
	}
	int getCost() {
		return cost;
	}
}





