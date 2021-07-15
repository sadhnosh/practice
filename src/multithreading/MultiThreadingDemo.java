package multithreading;

class Hi extends Thread{
	public void run(){
		for (int i=1; i<=5;i++) {
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e){};
		}
	}
}

class Hello extends Thread{
	public void run(){
		for (int i=1; i<=5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e){};
		}
	}
}
public class MultiThreadingDemo {

	public static void main(String args[]) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		//obj1.start();
		//obj2.start();
		
		//Runnable runnable = new Thread(() -> {System.out.println("Hello");});
		Thread t1 = new Thread(()->{System.out.println("test");});
		t1.start();
		
		
	}
}
