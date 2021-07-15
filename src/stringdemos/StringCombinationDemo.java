package stringdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Java program to print all the permutations
// of the given string

public class StringCombinationDemo {
  
	static List<Character> vowelList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
	static Set<String> permutationSet =new HashSet<String>();
    // Function to print all the permutations of str
    static void printPermutn(String str, String ans)
    {
        // If string is empty
        if (str.length() == 0 && !vowelList.contains(ans.charAt(0))) {
            permutationSet.add(ans);
            return;
        }
  
        for (int i = 0; i < str.length(); i++) {
  
            // ith character of str
            char ch = str.charAt(i);
  
            // Rest of the string after excluding 
            // the ith character
            String ros = str.substring(0, i) + 
                         str.substring(i + 1);
  
            // Recurvise call
            printPermutn(ros, ans + ch);
        }
    }


  
    // Driver code
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter Your String ");
       String s = scanner.nextLine();
        printPermutn(s, "");
        System.out.println(permutationSet.size());
    }
}