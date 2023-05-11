package package3;


public class ex12 {
	
	
	public static void main(String[] args) {
		ProductCode<Number, Integer> c1=new ProductCode<Number, Integer>();//c1 instantiation
//		 ProductCode<Number, String> c2=new ProductCode<Number, String>();//c2 instantiation
		}
}

class ProductCode<T,S extends T>{
	T c1;
	S c2;
}

//class ProductCode2<T,S>{
//	T c1;
//	S c2;
//}

//class ProductCode3<T,S super T>{
//	T c1;
//	S c2;
//}
//
//class ProductCode4<T, S<Integer>>{
//	T c1;
//	S c2;
//}


	






