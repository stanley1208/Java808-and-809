package package5;


public class ex11 {

	
	public static void main(String[] args){
		try {
		Candidate c=new Candidate("James",200);
		Candidate c1=new Candidate("Williams",32);
		System.out.println(c);
		System.out.println(c1);
		}catch(MissingInfoException e) {
			
		}catch(AgeOutOfRangeException e){
			
		}catch(Exception e) {
			
		}
	}

}

class MissingInfoException extends Exception{
	
}

class AgeOutOfRangeException extends Exception{
	
}

class Candidate{
	String name;
	int age;
	
	Candidate(String name,int age) throws Exception{
		if(name==null) {
			throw new MissingInfoException();
		}else if(age <=10 || age>=150) {
			throw new AgeOutOfRangeException();
		}else {
			this.name=name;
			this.age=age;
		}
	}
	
	public String toString() {
		return name+" age: "+age;
	}
}


