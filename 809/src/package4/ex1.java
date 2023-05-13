package package4;

public class ex1 {

	public static void main(String[] args) {
		Moveable animal = n -> System.out.println(n);
		animal.run(100);
		animal.walk(200);
	}

}

interface Moveable<Integer> {
	 
    public default void walk(Integer distance) {
        System.out.println("Walking");
    }
 
    public void run(Integer distance);
}