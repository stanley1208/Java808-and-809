package package1;

public class ex5 {
	public static void main(String args[])
	{
		Book1 b1 = new Book1(101, "Java Programing");
		Book1 b2 = new Book1(102, "Java Programing");
		System.out.println(b1.equals(b2));
	}
	

}

class Book1 {
	 
    int id;
    String name;
 
    public Book1(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    public boolean equals(Object obj) { //line n1
        boolean output = false;
        Book1 b = (Book1) obj;
        if (this.name.equals(b.name)) {
            output = true;
        }
        return output;
    }
}
