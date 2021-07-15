package practice;

class Calc{
	int num1;
	int num2;
	int result;
	
	void add() {
		result=num1+num2;
	}
	
	String add(int a) {
		return "";
	}
	
	public String Calc() {
		// TODO Auto-generated constructor stub
		System.out.println("its a mehtod");
		return "";
	}
	
	public Calc() {
		num1=5;
		num2=4;
		System.out.println("In construtor");
	}
	
	public Calc(int i) {
		System.out.println("in single parameterized ");
		num1=i;
	}
	
	public Calc(int num1,int  num2) {
		this.num1=num1;
		this.num2=num2;
	}
}

public class ObjectDemo {

	public static void main(String args[]) {
		
		Calc obj =new Calc();//knows something and does something
		//obj.num1=2;
		//obj.num2=4;
		obj.add();
		
		System.out.println(obj.result);
		System.out.println(obj.num1);
		
		obj.Calc();
		
		Calc obj2 = new Calc(1);
		System.out.println(obj2.result);
		System.out.println(obj2.num1);
	
	}
}
