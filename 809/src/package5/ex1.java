package package5;

public class ex1 {

	public static void main(String[] args) throws Exception{
		Vehicle v = new SolarVehicle();
	    v.ride();
	}

}

class FuelNotAvailException extends Exception {
}

class Vehicle {
	 
	protected void ride() throws Exception { //line n1
        System.out.println("Happy Journey!");
    }
}

class SolarVehicle extends Vehicle {
	 
	public void ride() throws Exception { //line n2
        super.ride();
    }
}