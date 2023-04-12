package package5;

public class ex14 {
	
	public static void main(String[] args){
		
	}
}

class Engine{
	double fueLevel1;
	Engine(int fueLevel1){
		this.fueLevel1=fueLevel1;
	}
	public void start() {
		assert fueLevel1>0:"Impossible fuel";
		System.out.println("Started");
	}
	
	public void stop() {
		System.out.println("Stopped");
	}
}


