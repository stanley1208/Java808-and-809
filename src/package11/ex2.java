package package11;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Optional;

public class ex2 {

	public static void main(String[] args) {
		Address address=null;
		Optional<Address>addrs1=Optional.ofNullable(address);
		Employee e1=new Employee(addrs1);
		String eAddress=addrs1.isPresent()?addrs1.get().getCity():"City Not Avaliable";
		System.out.println(eAddress);
	}

	

}

class Employee{
	Optional<Address> address;
	
	Employee(Optional<Address>address){
		this.address=address;
	}
	
	public Optional<Address>getAddress(){
		return address;
	}
}

class Address{
	String city="Los Angeles";
	
	public String getCity() {
		return city;
	}
	
	public String toString() {
		return city;
	}
}