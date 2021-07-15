package practice;

public class ExceptionHandlingDemo {
	
	public static void main(String args[]) {

		int i=5;
		try {
			System.out.println(i/0);
			throw new Exception();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Inside catch block");
		}catch (Exception e) {
			// TODO: handle exception//
			System.out.println("It is in the Exception");
		}finally {
			System.out.println("Here is the Finally block");
		}
		
		System.out.println("Continueng the application");
		
		try {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
