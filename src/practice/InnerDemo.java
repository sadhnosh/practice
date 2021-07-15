package practice;


/*
 * Inner Class
 * Member Class
 * Static Class
 * 
 */
class Outer{
	int a;
	
	void show() {
		System.out.println("OuterClass");
	}
	
	class Inner{//Outer$inner.class
		void display() {
			System.out.println("In Inner");
		}
	}
}


public class InnerDemo {
public static void main(String args[]) {
	
	Outer obj = new Outer();
	obj.show();
	
	// in order to create object of inner class we need outer class object. If it is not static
	
	Outer.Inner obj1= obj.new Inner();
	obj1.display();
	/// If static inner class
	// Outer.Inner obj1 = new Outer.Inner();
	
	
}
}
