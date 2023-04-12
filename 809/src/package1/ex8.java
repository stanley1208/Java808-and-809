package package1;


	
	


public class ex8 {

	public String toString() {
		return "X ";
	}
	
	public static void main(String[] args) {
		Y myY=new Y();
		X myX=myY;// new Y();
		Z myZ=myX;// new Y();
		System.out.print(myX);
		System.out.print((Y)myX);
		System.out.print(myZ);
	}

}


class X implements Z{
	{
		
	}
}
class Y extends X{
	public String toString() {
		return "Y ";
	}
}
interface Z{
	public String toString(); 
		
	
}