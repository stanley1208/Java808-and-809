package package3;

import java.util.ArrayDeque;
import java.util.Deque;


public class ex21 {
	
	
	public static void main(String[] args) {
			Foo1<String,String>grade=new Foo1<>("John","A");
			Foo1<String,Integer>mark=new Foo1<String,Integer>("Steve",100);
//			Foo1<Object,Object> percentage=new Foo1<String,Integer>("Steve",100);
			Foo1<String,String>pair=Foo1.<String>twice("Hello World!");
		}
	
	

}

class Foo1<K,V> {
	private K key;
	private V value;
	
	public Foo1(K key,V value) { this.key=key; this.value=value;}
	
	public static<T> Foo1<T,T> twice(T value) { return new Foo1<T,T>(value,value);}
	
	
	public K getKey() { return key; }
	public V getValue() { return value; }

}





	






