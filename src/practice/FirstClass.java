package practice;

public class FirstClass {

	public static void main(String args[]){
		System.out.println("Hello World"); 
		
		int a= 12234;// take till eight 0
		System.out.println("int " +a);
		
		float b  =1.0f;
		System.out.println(" Float needs f " + b);
		
		double c =2.0;
		System.out.println("double " +c);
		
		char d = 65; // if we give number it will print ascii value
		System.out.println("char " + d);
		
		int e =d;
		System.out.println("implicit of char to int " + e);
		
		int f = (int) c; // need explicit cast since it a double value
		System.out.println("Explicit cast double value 2.0 is "+ f);
		
		long g = 123445678901l;
		System.out.println("Requred l since it take more value than in " +g);
		
		//operator 
		
		int m,n,o,p;
		m=5;
		n=6;
		
		m=++n; // pre increment... first inc the value and then assign it.
		System.out.println("pre inc eg "+ m);
		System.out.println("pre inc eg "+ n);
		
		o=5;
		p=6;
		
		o=p++; //post increment..  first assigne the  value and then increment it.
		
		System.out.println("post inc eg "+ o);
		System.out.println("post inc eg "+ p);
		
		// /devide operator return only p;
		
		int q=5;
		int r=4;
		
		System.out.println(q/r); // it will print only 1.
		System.out.println( (double) q/r); //type casting it will print 1.25
	}
}
