package practice;
// To solve multiple inheritance

//by default all variable are final in interface
//can have default static and abstract method
//private static and final method cannot be orverridden

interface Demo1{
	int numIsFInal=9;
	void show();
	default void  error() {
		System.out.println("In Demo 1");
	}
	
	static void test() {
		System.out.println("Static method");
	}
}

interface Demo2{
	void show();
	default void  error() {
		System.out.println("In Demo 1");
	}
}

class DemoImpll implements Demo1, Demo2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error() {
		// TODO Auto-generated method stub
		Demo1.super.error();
	}
	
}
public class MultipleInheritanceDemo {

	public static void main(String args[]) {
		
		Demo1 demo1 = new DemoImpll();
		demo1.error();
		
		
	}
}
