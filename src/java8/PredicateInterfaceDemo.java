package java8;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length()%2==0;
			}
		};
		
		Predicate<Integer> predicate2 =  i -> i>5;
		
		System.out.println(predicate.test("Hello"));
		
		System.out.println(predicate2.test(10));

	}

}
