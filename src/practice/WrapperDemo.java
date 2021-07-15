package practice;

public class WrapperDemo {

	public static void main(String args[]) {
		int i = 5; //Premitive data type.
		
		Integer ii = new Integer(3);
		Integer iii = new Integer(i); // Boxing-wrapping
		
		int j =iii.intValue();// unboxing --unwrapping
		
		Integer value = i; //Auto Boxing
		
		int k =value; // autoUnboxing
		
		//hibernate and collection api uses wrapper classes
		
		
	}
}
