package week06DebugginAndUnitTests;

public class Card {

	int value;
	String name;
	
	public int getValue() {
		return value;	
	}
	
	public void setValue(int v) {
		value = v;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String s) {
		name = s;
	}

	public void describe() {

		String str1 = "Your card is: " + name;
		String str2 = "Your cards value is: " + value;
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
