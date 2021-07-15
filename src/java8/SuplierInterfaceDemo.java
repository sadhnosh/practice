package java8;

import java.util.function.Supplier;

public class SuplierInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> supplier = new  Supplier<String>() {
			
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Vijay";
			}
		};
		
		System.out.println(supplier.get());
		
		Supplier<String> supplier2 = () -> "Atish";

		System.out.println(supplier2.get());
	}

}
