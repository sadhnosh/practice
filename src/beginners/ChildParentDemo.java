package beginners;

class B{
	void m1() {
		System.out.println("In B");
	}
}

class C extends B{
	
	@Override
	void m1() {
		System.out.println("In C");
	}
}

public class ChildParentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	C c = new B();
		B b = new C();

	}

}
