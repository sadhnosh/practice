package practice;

//class and both need to have abstract.. if method has abstract.. cannot instanitiate abstract class

abstract class Human{
	public abstract void eat();
	void walk() {
		
	}
}

class Men extends Human{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractDemo {

	public static void main(String args[]) {
		Human human = new Men();
	}
}
