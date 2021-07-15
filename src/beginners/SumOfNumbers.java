package beginners;

public class SumOfNumbers {

	public static void main(String[] args) {
		int num=12345;
		System.out.println("Sum of " + num + " is " + sumofNumbers(num));
		
	}

	static int sumofNumbers(int num) {
		int sum =0;
		while(num>0) {
			sum=sum + num%10;
			num=num/10;
		}
		return sum;
	}
}
