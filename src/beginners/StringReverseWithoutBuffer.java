package beginners;

import java.util.Scanner;


public class StringReverseWithoutBuffer {

	public static void main(String args[]) {
		String userString;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String ");
		userString = sc.next();

		System.out.println("Reverse String  using loop is -> " + getReverseString(userString));
		System.out.println("Reverse String  using Array is -> " + getReverseStringUsingArray(userString));

	}

	static String getReverseString(String userString) {
		String reverseString = "";
		int length = userString.length() - 1;
		while (length >= 0) {
			reverseString = reverseString + userString.charAt(length);
			length--;
		}
		return reverseString;

	}
	
	static String getReverseStringUsingArray(String userString) {
		String reverseString = "";
		char[] chars = userString.toCharArray();
		for (int i = chars.length-1; i >= 0; i--) {
			reverseString = reverseString + chars[i];			
		}
		return reverseString;
	}
}
