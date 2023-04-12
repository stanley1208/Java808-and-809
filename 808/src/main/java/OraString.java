
public class OraString {
	String s;
	public boolean equals(OraString str) {
		return this.s.equalsIgnoreCase(str.toString());
	}
	OraString(String s) { 
		this.s = s; 
	}
	public static void main(String[] args) {
		String s1 = "Moon"; 
		OraString s2 = new OraString("Moon"); 
		if ((s1 == "Moon") && (s2.equals("Moon"))) { System.out.print("A"); 
		} else { 
		System.out.print("B"); 
		} 
		if (s1.equalsIgnoreCase(s2.s)) { 
		System.out.print("C"); 
		} else { 
		System.out.print("D"); 
		} 

	}

}
