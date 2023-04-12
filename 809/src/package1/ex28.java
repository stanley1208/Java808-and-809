
package package1;


public class ex28 {
	
	
	public static void main(String[] args) {
		
		StringBuilder message=new StringBuilder("hello java!");
		int pos;
		try {
			for(pos=0;pos<12;pos++) {
				switch(message.charAt(pos)) {
				case 'a':
				case 'e':
				case 'o':
					String uc=Character.toString(message.charAt(pos)).toUpperCase();
					message.replace(pos, pos+1, uc);
				}
			}
		}catch(Exception e) {
			System.out.println("Out of limits");
		}
		System.out.println(message);
	}
	
	
}

