package misc;

import java.util.Collections;
import java.util.Scanner;

public class SmarterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.nextLine();
		
		System.out.println(findGreaterNumber(num1, num2));
		
		Collections.sort(null);

	}
	
	static int findGreaterNumber (String num1, String num2) {
		
		StringBuilder n1 = new StringBuilder(num1);
		StringBuilder n2 = new StringBuilder(num2);
		
		num1 = n1.reverse().toString();
		num2 = n2.reverse().toString();
		
		if (Integer.valueOf(num1) > Integer.valueOf(num2)) {
			return  Integer.valueOf(num1);
		}
		return Integer.valueOf(num2);
	}

}
