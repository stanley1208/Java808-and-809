package package3;


public class ex5<T> {
	 
    private T t;
 
    public T get() {
        return t;
    }
 
    public void set(T t) {
        this.t = t;
    }
 
    public static void main(String args[]) {
    	ex5<String> type = new ex5<>();
    	ex5 type1 = new ex5(); //line n1
        type.set("Java");
        type1.set(100); //line n2
        System.out.print(type.get() + " " + type1.get());
    }
}




