package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> function = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
		};
		
		System.out.println(function.apply("Hello world"));
		
		Function<Integer, Integer> function2 = t -> t*2;
		
		System.out.println(function.andThen(function2).apply("Hello World"));
		
		List<String> myList = Arrays.asList("java", "spring", "hibernate","pl/sql");
		System.out.println(myList);
		Map<String, Integer> myMap = convertListToMap(myList, x->x.length());
		System.out.println(myMap);
	}
	
	static <T,R> Map<T,R> convertListToMap(List<T> list, Function<T, R> func) {
		Map<T, R> result = new HashMap<>();
		
		for (T t : list) {
			result.put(t, func.apply(t));
		}
		return result;
	}

}
