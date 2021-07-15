package beginners;

class Singleton{
	private static Singleton singleton;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(singleton==null) {
			return singleton = new Singleton();
		}else {
			return singleton;
		}
		
	}
	
	
}
public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		Singleton singleton3 = singleton;
		
		System.out.println(singleton);
		System.out.println(singleton2);
		System.out.println(singleton3);
		
	}

}
