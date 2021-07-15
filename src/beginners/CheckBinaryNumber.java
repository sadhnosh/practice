package beginners;

import java.util.HashMap;
import java.util.TreeSet;

public class CheckBinaryNumber {

	public static void main(String[] args) {

		int num =110104;
		System.out.println("Hi");
		System.out.println("is Num " + num + " binary? " + checkBinaryNum(num) );
	}
	
	static boolean checkBinaryNum(int num) {//also we can do by n%10>0
		boolean isBinary = true;
		while(num>0) {
			if(!(num%10==0 || num%10==1)) {
				return false;
			}
			num=num/10;
		}
		return isBinary;
	}

}
