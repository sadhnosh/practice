package practice;


// binding data with methods... create getter setter and make variable privatel
public class EncapsulationDemo {

	private int num;
	private String name;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String args[]) {
		
		EncapsulationDemo demo= new EncapsulationDemo();
		demo.setName("test");
		demo.setNum(1);
		
		System.out.println("Num " + demo.getNum() + " Name " + demo.getName());
	}
}
