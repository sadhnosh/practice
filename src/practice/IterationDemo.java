package practice;

public class IterationDemo {

	public static void main(String args[]) {
		int i=1;
		while(i<=5) {
			System.out.println("while");
			i++;
		}
		 int j=9;
		do{ // first do then check... iven if condition false it will run once.
			System.out.println(" dowhile");
		}while(j<=5);
		
		for(int k =1; k<=5; k++) {
			System.out.println("num " + k);
		}
	}
}
