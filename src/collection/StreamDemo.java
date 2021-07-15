package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "aab12AC44ccba";
		Map<Character, Integer> charCountMap = new HashMap();
		
		for(int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			if(charCountMap.containsKey(c)) {
				int count = charCountMap.get(c) +1 ;
				charCountMap.put(c, charCountMap.get(c) +1  );
			}else {
				charCountMap.put(c, 1);
			}
			
		}
		
		System.out.println(charCountMap);
		Set<Character> charSet = charCountMap.keySet();
		
		for(char c: charSet) {
			System.out.println("Char " + c + " Count " + charCountMap.get(c));
		}
		
		List<Integer> numList = new ArrayList();
		numList.add(10);
		numList.add(10);
		numList.add(20);
		numList.add(30);
		
		System.out.println(numList.stream().filter(i  ->  i>=20).collect(Collectors.toList()));
		
		
		
	}
	
	
	

}
