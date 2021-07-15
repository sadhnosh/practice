package beginners;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if (num%i==0) {
				isPrime=false;
			}
		}
		System.out.println( num + " is it prime ? " + isPrime);
	}

}
