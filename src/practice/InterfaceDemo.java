package practice;


// Normal Interface which has more than one
// Single Abstract interface only one -- in 8 we have functional interface-- can use lambda interface-scala
//Marker Interface.. does not have any method.. Serializable interface clonable
//in 1.8 

//Abstract class -> Define and declare
// Interace -> declare -> 1.7 
//1.8 can define methods default methoda
interface AB{
	void show();
}

interface Demo{
	void abc();
	
	//final t1();
	//private t2 ();
	default void show() {
		System.out.println("Default method in interface");
	}

	static void test() {
		System.out.println("testing the static method");
	}
	
}

class DemoImpl implements Demo{
	
	Object obj= new Object();

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("overrridede abc as usual");
	}
	
	@Override
	public void show() {
		System.out.println("Overrrided Default method");
	}
	
	//@Override
	public static void test() {
		System.out.println("Overriding static method");
	}
}
class  ABC implements AB{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Implemented method");
		
	}
	
	
}
public class InterfaceDemo {

	public static void main(String args[]) {
		AB a = new ABC();
		a.show();
		
		AB ab = new AB() {
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("Anonymus Class object");
			}
		};
		ab.show();
		
		
		AB usingLambda = () -> System.out.println("uses lambda");
		usingLambda.show();
		
		//using jave 8 intreface with default method
		
		Demo demo =  new DemoImpl();
		demo.abc();
		demo.show();
	}
}
