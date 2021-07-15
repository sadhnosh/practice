package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class HashmapDemo {

	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put(" ", 1);
		map.put("  ", 2);
		System.out.println(map);
		map.get(" ");
		Logger.getLogger("");
	}
}
