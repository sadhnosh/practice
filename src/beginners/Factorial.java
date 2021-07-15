package beginners;

public class Factorial {

	
	public static void main(String args[]) {
		int num = 5;
		
		System.out.println("Factorial of " + num + " is " +  getFactorial(num));
	}
	
	static int getFactorial(int num) {
		int fact = num;
		while(num>1) {
			num--;
			fact = fact * num;
		}
		return fact;
	}
}
