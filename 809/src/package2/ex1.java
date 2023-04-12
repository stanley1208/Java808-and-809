package package2;

public class ex1 {

	public static void main(String[] args) {
		USCurrency usCoin=USCurrency.QUARTER;
		System.out.println(USCurrency.QUARTER.getValue());

	}

}

enum USCurrency{
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private int value;
	USCurrency(int value){
		this.value=value;
	}
	
	public int getValue() {
		return value;
	}
}