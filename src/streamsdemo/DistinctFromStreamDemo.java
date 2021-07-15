package streamsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctFromStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i<10; i++) {
			list.add(i);
		}
		for (int i = 0; i<10; i++) {
			list.add(i);
		}
		
		
		
		System.out.println(list);

		System.out.println(list.stream().filter(i -> i>4).distinct().collect(Collectors.toList()));
		
		System.out.println(list);
		
		System.out.println(list.stream().map(i -> i*2).collect(Collectors.toList()));
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) { return o1.compareTo(o2);};
		});
		
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		list.add(0, null);
		
		System.out.println(list.stream().sorted().collect(Collectors.toList()));

		System.out.println(list);
		
		list.sort((o1,o2) -> {return o1.compareTo(o2);});
		System.out.println(list);
		
		Integer a= new Integer(2);
		int b=a%2;
		
		
	}

}
