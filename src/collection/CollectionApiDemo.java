package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//collection means topic..
//Collection means Interface..
//Collections means class.
public class CollectionApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		TreeMap<Integer, String> sortedMap = new TreeMap<>(map);
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(sortedMap);
		System.out.println(sortedMap);
		
		TreeSet<StudentD> treeSet = new TreeSet<>((o1,o2) -> { return o1.name.compareTo(o2.name);});
		
		List<String> list = new ArrayList<>();
		Set<String> sett = new HashSet<>();
		
		System.out.println(map);
		
		Iterator<Integer> iterator = map.keySet().iterator();
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			 System.out.println("using Iterator key " + integer + " value " + map.get(integer) );
		}
		
		
		/// option 2 for each loop;
		Set<Integer> set = map.keySet();
		
		for (Integer integer : set) {
			System.out.println(" Using for loop key " + integer + "  value " + map.get(integer));
		}
		
		
		// option 3 Entry set
		
		//wrong  Entry<Integer, String> entry = (Entry<Integer, String>) map.entrySet();
		
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		
		for (Entry<Integer, String> entry2 : entry) {
			System.out.println("Using entrySet key " + entry2.getKey() + " value " + entry2.getValue());
		}
		
		// using entry set with iterator
		
Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		
		Iterator<Entry<Integer, String>> iterator2 = entrySet.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry2 = (Map.Entry<java.lang.Integer, java.lang.String>) iterator2
					.next();
			
			System.out.println("using entryset with iterator Key " + entry2.getKey() + "  Value " + entry2.getValue());
			
		}
	}

}
