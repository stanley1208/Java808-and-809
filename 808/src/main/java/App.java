
public class App {
	public static void main(String[] args) throws Exception {
		try {
		System.out.println("blue");
		m();
		throw new Exception();
		} catch (RuntimeException re) {
		System.out.println("yellow");
		} catch (Exception e) {
		System.out.println("green");
		} finally {
		System.out.println("orange");
		}
		}
		public static void m() {
		System.out.println("purple");
		throw new RuntimeException();
		}
}
