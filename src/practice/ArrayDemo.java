package practice;

class Student {
	int num;
	String name;
	
	public Student(int num, String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.num=num;
	}
}

public class ArrayDemo {

	public static void main(String args[]) {
		
		int num[] = new int[10];// Array of int
		//if we know the value  int num[] = {1,2,3,4,5};
		for(int i=0; i<=9;i++) {
			num[i]=i;
		}
		for(int i=0; i<=9;i++) {
			System.out.println(num[i]);
		}
		
		
		/// Create array of object
		
		Student s1 = new Student(1, "a");
		Student s2 = new Student(2, "b");
		Student s3 = new Student(3, "c");
		Student s4 = new Student(4, "d");
		
		Student studentArray[] = {s1,s2,s3,s4};
		
		for(int i=0; i<=3;i++) {
			System.out.println("Student Number " + studentArray[i].num + " Student Name " + studentArray[i].name);
		}
		
		// Create Multi Dimension Array
		
		int d[][] = {
						{1,2,3,4},
						{5,6,7,8},
						{9,0,1,2}
				
					};
		
		for(int i=0; i<3;i++) {
			for(int j=0; j<4;j++) {
				System.out.print(" "+ d[i][j]);
			}
			System.out.println();
		}
		// using for each loop
		for (Student student: studentArray) {
			System.out.println("Num " + student.num + " Name " + student.name);
		}
		
		
		//use for each for 2d array
		
		for(int k[]:d) {
			for (int l:k) {
				System.out.print(" " + l);
			}
			System.out.println();
		}
	}
}
