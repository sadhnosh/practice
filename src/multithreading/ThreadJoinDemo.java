package multithreading;

public class ThreadJoinDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(()->{for (int i=1; i<=5;i++) {
			System.out.println("Hi Using Thread lambda expression");
			try{Thread.sleep(500);} catch(Exception e){};
		}});
		
		Thread t2 = new Thread(()->{for (int i=1; i<=5;i++) {
			System.out.println("Hello Using Thread lambda expression");
			try{Thread.sleep(500);} catch(Exception e){};
		}});

		t1.start();
		t2.start();
		
		t1.join();
		t2.join(); 
		
		System.out.println("In A middle of thred Execution");
		
	}

}
