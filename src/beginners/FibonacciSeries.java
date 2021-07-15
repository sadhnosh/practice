package beginners;

public class FibonacciSeries {

	
	public static void main(String args[]) {
		
		int num1=0,num2=1,num3 =0;
		int count = 15;
		System.out.println(num1);
		System.out.println(num2);
		while(count>=0) {
			num3 = num1 + num2;
			num1 = num2;
			num2= num3;
			
			count --;
			
			System.out.println(num3);
	
		}
		
		
		
	}
}
