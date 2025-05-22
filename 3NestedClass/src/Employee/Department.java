package Employee;
import java.util.*;

class Department{
	String department_name;
	List<Employee> employees;
	
	public Department(String department) {
		this.department_name = department;
		this.employees = new ArrayList<>();
	}
	
	class Employee{
		int id;
		String name;
		int salary;
		
		public Employee(int id,String name,int salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
		public void display() {
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("Salary : "+salary);
		}
	}
	
	public void add_employee(int id,String name,int salary){
		Employee emp = new Employee(id,name,salary);
		employees.add(emp);
	}
	
	public void display_employees() {
		System.out.println("Department : "+department_name);
		for(Employee emp: employees) {
			emp.display();
		}
	}
	
	public void count_employess() {
		int count = 0;
		for(Employee emp: employees) {
			count++;
		}
		System.out.println("Employee Count : "+count);
	}
}