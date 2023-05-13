package package4;

public class ex5 {

	public static void main(String[] args) {
		
//		Rideable x=new Car("abc");
		
		Rideable x1=(String name)->new Car(name);
		Rideable x2=name->new Car(name);
		Rideable x3=Car::new;
		
		x1.getCar("aaa");
		
		Rideable rider=Car::new;
		Car vehicle=rider.getCar("MyCar");
	}

}

//Rideable can only have one method
interface Rideable {
	 
    Car getCar(String name);
}

class Car{
	 
    private String name;
 
    public Car(String name) {
        this.name = name;
    }
}