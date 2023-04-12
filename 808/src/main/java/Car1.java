
class Car1 extends Vehicle1 {
int y;
Car1() {
super(10); // line n2
}
Car1(int y) {
super(y);
this.y = y;
}
public String toString() {
return super.x + ":" + this.y;
}
public static void main(String[] args) {
	Vehicle1 y = new Car1(20);
	System.out.println(y);
}
}