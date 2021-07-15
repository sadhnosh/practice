package practice;

class A{
	public A() {
		System.out.println("In A");
	}
	
	public A(int i) {
		System.out.println("In A int i");
	}
}

class B extends A{
	public B() {
		System.out.println("In B");
	}
	
	public B(int i) {
		super(i);
		System.out.println("In B int i");
	}
	
}

public class SuperDemo {

	public static void main(String args[] ) {
		
		B b= new B(2);
		
	}
}
