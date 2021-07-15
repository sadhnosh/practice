package beginners;

public class PalindromString {

	public static void main(String args[]) {
		
		String userInput = "abcd";
		
		System.out.println("is " + userInput + " is palindrome " + checkPalindrome(userInput));
		
	}
	
	static boolean checkPalindrome(String str) {
		for(int i=0, j=str.length()-1; i<str.length()/2; i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
}
