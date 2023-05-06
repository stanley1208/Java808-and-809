package package2;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ex19 {
	
	public static void main(String[] args) {
		
	}
}

class Vehicle1{
	int id;
	public void start() {
		 class Engine{int eNo=id;}
	}
}

class Product{
	interface Moveable{	void move();}
	Moveable mProduct=new Moveable() {
		public void move() {};
	};
}

class Block{
	static int bno;
	static class Counter{
		int locator;
		Counter(){locator=bno;}
	}
}

class Computer{
	
	private abstract class Card{};
	public class SoundCard extends Card{}
	private Card sCard=new SoundCard();
}

