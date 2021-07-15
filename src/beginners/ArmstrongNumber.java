package beginners;

public class ArmstrongNumber {

	
	public static void main(String args[]) {
		
		int number=371;
		
		System.out.println("Is " + number + " is armStrong " + checkArmstrongNumber(number));
		System.out.printf(null, args);
	}
	
	static boolean checkArmstrongNumber(int number) {
		int num = number,reminder;
		int sum=0, totalSum=0;
		while(num>0) {
			reminder= num%10;
			sum = reminder*reminder*reminder;
			num=num/10;
			totalSum= totalSum + sum;
		}
		
		if (number==totalSum) {
			return true;
		}
		
		return false;
	}
}
