package beginners;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345678;
		
		System.out.println("Reverse of num " + num + "  Is " + reverseNumber(num));

	}
	
	static int reverseNumber(int num) {
		int remainder=0;
		int reverse=0;
		while(num>0) {
			 remainder =  num%10;  //getting the remainder...
			 num = num/10; // getting the number after deviding by 10
			 reverse = reverse*10 + remainder; // getting the reverse
		}
		return reverse;
	}

}
