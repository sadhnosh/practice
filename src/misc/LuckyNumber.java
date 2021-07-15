package misc;

public class LuckyNumber {

	public static void main( String args[] ) {
		
		System.out.println("hello");
		System.out.println(luckyNumberCount(1, 5));
		
		
	}
	
	static int luckyNumberCount(Integer start, Integer end) {
		int luckyNumberCount=0;
		
		while(start<=end) {
			String checkNumber = start.toString();
			if((checkNumber.contains("6") || checkNumber.contains("8")) && !(checkNumber.contains("6") && checkNumber.contains("8")));{
				luckyNumberCount ++;
			}
			start ++;
		}		
		return luckyNumberCount;
	}

}
