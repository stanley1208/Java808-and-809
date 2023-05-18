package package5;

public class ex14 {
	
	public static void main(String[] args){
		
	}
}

class Engine{
	double fuelLevel1;
	Engine(int fuelLevel1){
		this.fuelLevel1=fuelLevel1;
	}
	public void start() {
		assert fuelLevel1>0:"Impossible fuel";
		
		System.out.println("Started");
	}
	
	public void stop() {
		System.out.println("Stopped");
	}
}


