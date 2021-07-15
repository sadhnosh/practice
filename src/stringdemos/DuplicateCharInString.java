package stringdemos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String args[]) {
		String demo = "aaaa";
		Map<Character, Integer> map = new HashMap<>();
		
		char arr[] = demo.toCharArray();
		Set<Character> set =new HashSet<>();
		
		for (char c : arr) {
			if (set.add(c)) {
				map.put(c, 1);
			}else {
				int count = map.get(c) + 1;
				map.put(c,count);
			}
		}
		
		System.out.println(map);
		
		
		// Another way
		
		Map<Character, Integer> map2 = new HashMap<>();
		for(int i=0;i<demo.length();i++) {
			char c = demo.charAt(i);
			if (map2.containsKey(c)) {
				int count = map2.get(c);
				map2.put(c, ++count);
			}else {
				map2.put(c, 1);
			}
		}
		
		System.out.println(map2);
	}
}
