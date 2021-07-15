package beginners;

public class StringReversUsingBuffer {

	public static void main(String args[]) {
		String userInput = "Hello";
		
		System.out.println("Reverse of " + userInput + " is " + reverseStringUsingBuffer(userInput));
	}
	
	static String reverseStringUsingBuffer(String userInput) {
		StringBuffer sb = new StringBuffer(userInput);
		return sb.reverse().toString();
		
	}
}
