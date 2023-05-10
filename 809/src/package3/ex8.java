package package3;

import java.util.ArrayList;
import java.util.List;

public class ex8 {
	
	
	public static void main(String[] args) {
        List objs = new ArrayList();
        Contract c1 = new Super();
        Contract c2 = new Sub(); // line n1
        Super s1 = new Sub();
 
        objs.add(c1);
        objs.add(c2);
        objs.add(s1); // line n2
 
        for (Object itm : objs) {
            System.out.println(itm.getClass().getName());
        }
    }
}
	

interface Contract {
}
 
class Super implements Contract {
}
 
class Sub extends Super {
}




