package java8;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println("Hello " + t);
			}
		};
		
		consumer.accept("Vijay");
		
		Consumer<String> consumer2 = s -> System.out.println("Hello " + s);
		
		consumer.accept("Atish");
	}

}
