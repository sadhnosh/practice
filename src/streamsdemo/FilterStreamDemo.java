package streamsdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Employee{
	
	int id;
	String name;
	long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (salary ^ (salary >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}
	
	
}

public class FilterStreamDemo {

	public static void main(String args[]) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "vijay", 1000));
		empList.add(new Employee(1, "Ajay", 1500));
		empList.add(new Employee(1, "Hemant", 2000));
		empList.add(new Employee(1, "Atish", 1300));
		empList.add(new Employee(1, "Akshay", 1000));
		empList.add(new Employee(1, "Ashu", 1200));
		
		System.out.println(empList);
		
		
		System.out.println(empList.stream().filter(emp -> emp.getSalary()>1200).collect(Collectors.toList()));
		
		List<String> list = new ArrayList<>();
		list.add("ABAS");
		list.add("ABAS");
		
System.out.println(empList.stream().map(emp -> emp.getSalary()*2).collect(Collectors.toList()));
		
		int[] array = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(Arrays.stream(array).filter(i -> i % 2==0).toArray()));
		
		List<String> list2 = list.stream().sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
		
System.out.println(empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList()));
		
System.out.println(empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparingLong(Employee::getSalary)).collect(Collectors.toList()));


	}
}
