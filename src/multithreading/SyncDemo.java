package multithreading;
// not using means not thread safe
// when we use synchronized it is thread safe.. only one method will access at a time.
import java.util.Iterator;

class Counter {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println("Count Value " + c.count);

	}

}
