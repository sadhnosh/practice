package programs;

public class StringReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Reverse of MADAM " + reverse("MADAM"));

	}
	
	static String reverse(String str) {
		String rev = "";
		int length = str.length()-1;
		while(length>=0) {
			rev= rev + str.charAt(length);
			length--;
		}
		return rev;
	}

}
