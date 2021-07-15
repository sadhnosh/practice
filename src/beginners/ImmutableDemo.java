package beginners;

final class Immutable{
	final String name;
	
	public Immutable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

public class ImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Immutable immutable = new Immutable("Test");
		System.out.println(immutable.getName());

		
	}

}
