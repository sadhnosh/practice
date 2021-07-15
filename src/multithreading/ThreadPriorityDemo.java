package multithreading;

//1 to 10.
//1 Least  5 normal 10 Highest
//
public class ThreadPriorityDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()->{for (int i=1; i<=5;i++) {
			System.out.println("Hi Using Thread lambda expression");
			try{Thread.sleep(500);} catch(Exception e){};
		}},"Thread1");
		
		Thread t2 = new Thread(()->{for (int i=1; i<=5;i++) {
			System.out.println("Hello Using Thread lambda expression " + Thread.currentThread().getPriority());
			try{Thread.sleep(500);} catch(Exception e){};
		}},"Thread2");
//we can set the thread name
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join(); 
		
		System.out.println("In A middle of thred Execution");
	}

}
