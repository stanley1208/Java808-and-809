package package3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex11 {
	
	
	public static void main(String[] args) {
		List<String> li=Arrays.asList("Dog","Cat","Mouse");
		Test t=new Test();
		t.setList(li.stream().collect(Collectors.toList()));
		t.getList().forEach(Test::abc);
		}
}

class Test{
	List<String> list=null;
		public void printValues()
		{
			System.out.print(getList());
		}
		public List<String> getList(){ return list;}
		public void setList(List<String> newList){list=newList;}
		public static void abc(String msg) {
			
		}
}

	






