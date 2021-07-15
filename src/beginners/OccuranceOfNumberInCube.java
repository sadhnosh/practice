package beginners;

public class OccuranceOfNumberInCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number=1551;
		
		long cubeOfNumber = number*number*number;
		System.out.println("cube of " + number + " is " + cubeOfNumber);
		int count=0, digit=1;
		while(cubeOfNumber>0) {
			if(cubeOfNumber%10==digit) {
				count++;
			}
			cubeOfNumber = cubeOfNumber/10;
		}
	
		System.out.println("Occurance of " + digit + " in cube of " + number +" is " + count);
	}

}
