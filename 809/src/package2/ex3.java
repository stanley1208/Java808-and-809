package package2;

public class ex3 {

	public static void main(String[] args) {
		
	}

}
interface Drawable{
	public abstract void draw();
}
class Canvas implements Drawable{
	public void draw() {
		
	}
}
abstract class Board extends Canvas{
	
}
class Paper extends Canvas{
	protected void draw(int color) {
		
	}
}
class Frame extends Canvas implements Drawable{
	public void resize() {
		
	}
}
