package practice;

class A1{
	public void show() {
		System.out.println("In A");
	}
}

class B1 extends A1{
	@Override
	public void show() {
		//super.show();
		System.out.println("In B");
	}
	
	public void test() {
		System.out.println("test");
	}
}

class C1 extends A1{
	@Override
	public void show() {
		//super.show();
		System.out.println("In C");
	}
}
public class OverridingDemo {

	public static void main(String args[]) {
		B1 b1= new B1();
		//b1.show();
		b1.test();
		
		//runtime poly
		A1 obj = new B1();
		obj.show();
		
		//dynamic method dispatch
		obj = new C1();
		obj.show();
		
	}
}
