package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentD implements Comparable<StudentD> {

	int id;
	String name;
	String dept;
	int marks;

	@Override
	public int compareTo(StudentD o) {
		// TODO Auto-generated method stub
		if (this.marks > o.marks) {
			return 1;
		} else if (this.marks < o.marks) {
			return -1;
		} else {
			return 0;
		}
	}

	public StudentD(int id, String name, String dept, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentD [id=" + id + ", name=" + name + ", dept=" + dept + ", marks=" + marks + "]";
	}

}

public class ComparableDemo {

	public static void main(String args[]) {

		List<StudentD> list = new ArrayList<>();
		Integer integer =new Integer(1);
		integer.compareTo(1);
		
		
		Arrays.sort(null, null);

		list.add(new StudentD(1, "a", "1st", 100));
		list.add(new StudentD(2, "b", "1st", 90));
		list.add(new StudentD(3, "aa", "1st", 80));
		list.add(new StudentD(4, "bb", "1st", 70));

		System.out.println(list);

		// sort using marks
		Collections.sort(list);

		System.out.println("After Sorting");

		System.out.println(list);

		// sort using comparator
		System.out.println("Using Comparator");

		Collections.sort(list, new StudentComparator());

		System.out.println(list);

		// resort using marks
		System.out.println("After Sorting with marks");
		Collections.sort(list);
		System.out.println(list);

		// Sort Using Anonymous Class

		/*
		 * Collections.sort(list, new Comparator<StudentD>() {
		 * 
		 * @Override public int compare(StudentD o1, StudentD o2) { // TODO
		 * Auto-generated method stub if (o1.id > o2.id) { return 1; } else if (o1.id <
		 * o2.id) { return -1; } else { return 0; } } });
		 */

		System.out.println("sort using lambda expresssion");

		Collections.sort(list, (o1, o2) -> {
			return o1.name.compareTo(o2.name);
		});

		System.out.println(list);

		System.out.println("Sort Using Anonymous Class");

		System.out.println(list);

	}

}

class StudentComparator implements Comparator<StudentD> {

	@Override
	public int compare(StudentD o1, StudentD o2) {
		// TODO Auto-generated method stub
		if (o1.id > o2.id) {
			return 1;
		} else if (o1.id < o2.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

class testo{
	
	void test() {
		int a;
	}
}