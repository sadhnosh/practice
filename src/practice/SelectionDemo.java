package practice;

public class SelectionDemo {

	public static void main(String args[]) {
		int n=3;
		if(n%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		
		//ternary operator
		int a=n>2?4:5;
		
		
		///switch need break statement once the condition match else it will execute everything from there
		
		switch(a)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default:
			System.out.println("No match");;
			
		}
	}
	
}
