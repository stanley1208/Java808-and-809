package package2;

public interface book {
	String bookName(String name);
	 default void show() {
		
	}
}

class bookStyle{
	static String bn1(String name) {
		return "java7 name="+name;
	}
	
	static String bn2(String name) {
		return "java9 name="+name;
	}
	
	static String bn3(String name) {
		return "javaEE7 name="+name;
	}
}
