package package1;


	
public class ex23{
	
	// field
	int j;
    int k;
 
    public static void main(String[] args) {
        new ex23().doStuff();
    }
 
    void doStuff() {
        int x = 5;
        doStuff2();
        System.out.println("x");
    }
 
    void doStuff2() {
        int y = 7;
        System.out.println("y");
        for (int z = 0; z < 5; z++) {
            System.out.println("z");
            System.out.println("y");
        }
    }
}










