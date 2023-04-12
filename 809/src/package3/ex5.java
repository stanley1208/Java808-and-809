package package3;


public class ex5<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t=t;
	}
	
	public static void main(String[] args) {
		ex5<String> type=new ex5<>();
		ex5 type1=new ex5();
		type.set("java");
		type1.set(100);
		System.out.println(type.get()+" "+type1.get());
	}
}




