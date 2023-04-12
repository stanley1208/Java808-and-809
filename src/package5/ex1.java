package package5;

public class ex1 {

	public static void main(String[] args) throws Exception{
		Vehicle v=new SolarVehicle();
		v.ride();
	}

}

class FuelNotAvailException extends Exception{
	
}

class Vehicle{
	void ride() throws Exception{
		System.out.println("Happy Journey!");
	}
}

class SolarVehicle extends Vehicle{
	void ride() throws Exception{
		super.ride();
	}
}