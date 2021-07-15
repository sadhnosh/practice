package programs;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Number 2 is prime" + checkPrimeNumber(4));
		int num = 1;
		List<Integer> primeList = new ArrayList<Integer>();
		int count=10;
		while(count!=0) {
			if (checkPrimeNumber(num)) {
				primeList.add(num);
				count--;
			}
			num++;
		}
		
		System.out.println(primeList);
	}
	
	static boolean checkPrimeNumber(int num) {
		int i = 2;
		while(i<num-1) {
			if(num%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
