package practice;

class AnonymousA{
	void show() {
		System.out.println("In ANonymous A");
	}
}

// insteadof create class and overriding a method we can use ananymous class. its is for single time use only

public class AnonymousClass {
 public static void main(String args[]) {
	 
	 AnonymousA a = new AnonymousA() {
		 void show() {
				System.out.println("In ANonymous class");
			}
	 };
	 a.show();
 }
}
