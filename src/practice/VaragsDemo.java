package practice;

// Variable Length argument

class Calce{
	
	int add(int...n) {// it will consider number of parameter as array
		
		int sum=0;
		for(int k :n) {
			sum= sum + k;
		}
			return sum;
	}
}

public class VaragsDemo {

	public static void main(String args[]) {
		
		Calce objCalc = new Calce();
		System.out.println(objCalc.add(1,2,3,4,5,6,7));
	}
}
