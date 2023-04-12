package package2;

import java.util.ArrayList;
import java.util.List;

public class ex20 {
	
	public static void main(String[] args) {
		Engine carEngine=new Engine();
		carEngine.operate();
	}
}

abstract class Operator{
	protected abstract void turnON();
	protected abstract void turnOFF();
}

class EngineOperator extends Operator{
	public final void turnON() {
		System.out.println("ON");
	}
	public final void turnOFF() {
		System.out.println("OFF");
	}
}

class Engine{
	Operator m=new EngineOperator();
	public void operate() {
		m.turnON();
		m.turnOFF();
	}
}


