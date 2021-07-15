package multithreading;

class Hii implements Runnable{
	public void run(){
		for (int i=1; i<=5;i++) {
			System.out.println("Hi");
			try{Thread.sleep(500);} catch(Exception e){};
		}
	}
}

class Helloo implements Runnable{
	public void run(){
		for (int i=1; i<=5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(500);} catch(Exception e){};
		}
	}
}

public class RunnableThreadDemo {
public static void main(String args[]) {
		
		Runnable obj1 = new Hi();
		Runnable obj2 = new Hello();
		
		Runnable obj3 = new Runnable() {
			
			@Override
			public void run() {
				for (int i=1; i<=5;i++) {
					System.out.println("HelloUsing Anonymous class");
					try{Thread.sleep(500);} catch(Exception e){};
				}
				
			}
		};
		
		Runnable obj4 = () -> { for (int i=1; i<=5;i++) {
			System.out.println("HelloUsing Lambda exception");
			try{Thread.sleep(500);} catch(Exception e){};
		}};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		Thread t3 = new Thread(obj3);
		Thread t4 = new Thread(obj4);
		
		Thread t5 = new Thread(()->{for (int i=1; i<=5;i++) {
			System.out.println("HelloUsing Thread lambda expression");
			try{Thread.sleep(500);} catch(Exception e){};
		}});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
}
}
