package package2;

public class ex16 extends Shape{
	
	
	public static void main(String[] args) {
		
		
	}
	private int radius;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}

abstract class Shape {
	
	private int x;
	private int y;
	
	public abstract void draw();
	
	public void setAnchor(int x,int y){
		this.x=x;
		this.y=y;
	}
}

