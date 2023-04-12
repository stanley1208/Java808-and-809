package package4;

public class ex1 {

	public static void main(String[] args) {
		Moveable<Integer>m=distance->System.out.println("distance="+distance);
		m.run(100);
		m.walk(200);
	}

}

interface Moveable<Integer>{
	
	public default void walk(Integer distance) {
		System.out.println("Walking");
	}
	
	public void run(Integer distance); 
}
